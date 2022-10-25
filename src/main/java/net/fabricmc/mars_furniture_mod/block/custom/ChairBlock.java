package net.fabricmc.mars_furniture_mod.block.custom;

import java.util.stream.Stream;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class ChairBlock extends HorizontalFacingBlock {

    public ChairBlock(Settings settings){
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    //NORTH FACING VOXEL SHAPE
    private static final VoxelShape SHAPE_N = Stream.of(
        Block.createCuboidShape(12, 0, 1, 14, 7, 3),
        Block.createCuboidShape(2, 0, 13, 4, 7, 15),
        Block.createCuboidShape(2, 0, 1, 4, 7, 3),
        Block.createCuboidShape(12, 0, 13, 14, 7, 15),
        Block.createCuboidShape(2, 7, 1, 14, 9, 13),
        Block.createCuboidShape(2, 7, 13, 14, 22, 15)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    //SOUTH FACING VOXEL SHAPE
    private static final VoxelShape SHAPE_S = Stream.of(
        Block.createCuboidShape(2, 0, 13, 4, 7, 15),
        Block.createCuboidShape(12, 0, 1, 14, 7, 3),
        Block.createCuboidShape(12, 0, 13, 14, 7, 15),
        Block.createCuboidShape(2, 0, 1, 4, 7, 3),
        Block.createCuboidShape(2, 7, 3, 14, 9, 15),
        Block.createCuboidShape(2, 7, 1, 14, 22, 3)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    //EAST FACING VOXEL SHAPE
    private static final VoxelShape SHAPE_E = Stream.of(
        Block.createCuboidShape(13, 0, 12, 15, 7, 14),
        Block.createCuboidShape(1, 0, 2, 3, 7, 4),
        Block.createCuboidShape(13, 0, 2, 15, 7, 4),
        Block.createCuboidShape(1, 0, 12, 3, 7, 14),
        Block.createCuboidShape(3, 7, 2, 15, 9, 14),
        Block.createCuboidShape(1, 7, 2, 3, 22, 14)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    //WEST FACING VOXEL SHAPE
    private static final VoxelShape SHAPE_W = Stream.of(
        Block.createCuboidShape(1, 0, 2, 3, 7, 4),
        Block.createCuboidShape(13, 0, 12, 15, 7, 14),
        Block.createCuboidShape(1, 0, 12, 3, 7, 14),
        Block.createCuboidShape(13, 0, 2, 15, 7, 4),
        Block.createCuboidShape(1, 7, 2, 13, 9, 14),
        Block.createCuboidShape(13, 7, 2, 15, 22, 14)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    //CREATE VOXEL SHAPE BASED ON FACING
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context){
        switch (state.get(FACING)){
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }
    //ADD HORIZONTAL FACING PROPERTY TO BLOCK
    @Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
		stateManager.add(Properties.HORIZONTAL_FACING);
    }
    
    //GET PLACEMENT BLOCKSTATE FROM PLAYER LOCATION
    @Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return (BlockState)this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing());
	}

}
