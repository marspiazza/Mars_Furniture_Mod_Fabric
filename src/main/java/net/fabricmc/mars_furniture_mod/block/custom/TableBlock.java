package net.fabricmc.mars_furniture_mod.block.custom;

import java.util.stream.Stream;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class TableBlock extends Block {

    public TableBlock(Settings settings){
        super(settings);
    }
    
    private static final VoxelShape TABLE_VOXELS = Stream.of(
        Block.createCuboidShape(1, 0, 13, 3, 14, 15),
        Block.createCuboidShape(1, 0, 1, 3, 14, 3),
        Block.createCuboidShape(13, 0, 1, 15, 14, 3),
        Block.createCuboidShape(13, 0, 13, 15, 14, 15),
        Block.createCuboidShape(0, 14, 0, 16, 16, 16)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return TABLE_VOXELS;
    }

    //add in algorithm for leg placement from mcfm later - will have to change the models
}
