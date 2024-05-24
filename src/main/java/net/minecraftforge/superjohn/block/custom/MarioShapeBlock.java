package net.minecraftforge.superjohn.block.custom;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.superjohn.util.VoxelShapeHelper;

import java.util.ArrayList;
import java.util.List;

public abstract class MarioShapeBlock extends Block
{
    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public MarioShapeBlock(Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(DIRECTION, Direction.NORTH));
        SHAPES = this.generateShapes(this.getStateDefinition().getPossibleStates());
    }
    public static final DirectionProperty DIRECTION = BlockStateProperties.HORIZONTAL_FACING;

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        return super.getStateForPlacement(context).setValue(DIRECTION, context.getHorizontalDirection());
    }

    @Override
    public BlockState rotate(BlockState state, LevelAccessor world, BlockPos pos, Rotation rotation)
    {
        return state.setValue(DIRECTION, rotation.rotate(state.getValue(DIRECTION)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror)
    {
        return state.rotate(mirror.getRotation(state.getValue(DIRECTION)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(DIRECTION);
    }
    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        final VoxelShape[] SHAPE_1 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0, 16 * 0.0625, 16 * 0.4375, 16 * 0.125, 16 * 0.125), Direction.SOUTH));
        final VoxelShape[] SHAPE_2 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0, 16 * 0.3125, 16 * 0.5, 16 * 0.0625, 16 * 0.5), Direction.SOUTH));
        final VoxelShape[] SHAPE_3 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.375, 16 * 0, 16 * 0.25, 16 * 0.4375, 16 * 0.0625, 16 * 0.3125), Direction.SOUTH));
        final VoxelShape[] SHAPE_4 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.0625, 16 * 0.25, 16 * 0.5, 16 * 0.25, 16 * 0.6875), Direction.SOUTH));
        final VoxelShape[] SHAPE_5 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.25, 16 * 0.0625, 16 * 0.125, 16 * 0.5, 16 * 0.1875, 16 * 0.25), Direction.SOUTH));
        final VoxelShape[] SHAPE_6 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.25, 16 * 0.0625, 16 * 0.3125, 16 * 0.3125, 16 * 0.25, 16 * 0.625), Direction.SOUTH));
        final VoxelShape[] SHAPE_7 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5, 16 * 0.0625, 16 * 0.375, 16 * 0.5625, 16 * 0.125, 16 * 0.625), Direction.SOUTH));
        final VoxelShape[] SHAPE_8 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.1875, 16 * 0.125, 16 * 0.375, 16 * 0.25, 16 * 0.25, 16 * 0.5625), Direction.SOUTH));
        final VoxelShape[] SHAPE_9 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.375, 16 * 0.125, 16 * 0.6875, 16 * 0.5, 16 * 0.25, 16 * 0.75), Direction.SOUTH));
        final VoxelShape[] SHAPE_10 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5, 16 * 0.125, 16 * 0.4375, 16 * 0.75, 16 * 0.3125, 16 * 0.8125), Direction.SOUTH));
        final VoxelShape[] SHAPE_11 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5, 16 * 0.125, 16 * 0.375, 16 * 0.6875, 16 * 0.1875, 16 * 0.4375), Direction.SOUTH));
        final VoxelShape[] SHAPE_12 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5, 16 * 0.125, 16 * 0.3125, 16 * 0.625, 16 * 0.1875, 16 * 0.375), Direction.SOUTH));
        final VoxelShape[] SHAPE_13 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5625, 16 * 0.125, 16 * 0.8125, 16 * 0.6875, 16 * 0.1875, 16 * 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_14 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.25, 16 * 0.125, 16 * 0.25, 16 * 0.3125, 16 * 0.1875, 16 * 0.3125), Direction.SOUTH));
        final VoxelShape[] SHAPE_15 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5, 16 * 0.1875, 16 * 0.375, 16 * 0.75, 16 * 0.3125, 16 * 0.4375), Direction.SOUTH));
        final VoxelShape[] SHAPE_16 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5, 16 * 0.1875, 16 * 0.3125, 16 * 0.6875, 16 * 0.375, 16 * 0.375), Direction.SOUTH));
        final VoxelShape[] SHAPE_17 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5, 16 * 0.1875, 16 * 0.25, 16 * 0.5625, 16 * 0.25, 16 * 0.3125), Direction.SOUTH));
        final VoxelShape[] SHAPE_18 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.1875, 16 * 0.1875, 16 * 0.4375, 16 * 0.25, 16 * 0.25), Direction.SOUTH));
        final VoxelShape[] SHAPE_19 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5, 16 * 0.1875, 16 * 0.8125, 16 * 0.75, 16 * 0.25, 16 * 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_20 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.75, 16 * 0.1875, 16 * 0.4375, 16 * 0.8125, 16 * 0.3125, 16 * 0.75), Direction.SOUTH));
        final VoxelShape[] SHAPE_21 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5, 16 * 0.25, 16 * 0.25, 16 * 0.625, 16 * 0.375, 16 * 0.3125), Direction.SOUTH));
        final VoxelShape[] SHAPE_22 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.375, 16 * 0.25, 16 * 0.25, 16 * 0.5, 16 * 0.375, 16 * 0.75), Direction.SOUTH));
        final VoxelShape[] SHAPE_23 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.25, 16 * 0.3125, 16 * 0.375, 16 * 0.375, 16 * 0.625), Direction.SOUTH));
        final VoxelShape[] SHAPE_24 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.25, 16 * 0.25, 16 * 0.375, 16 * 0.3125, 16 * 0.3125, 16 * 0.5625), Direction.SOUTH));
        final VoxelShape[] SHAPE_25 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5625, 16 * 0.25, 16 * 0.8125, 16 * 0.6875, 16 * 0.3125, 16 * 0.9375), Direction.SOUTH));
        final VoxelShape[] SHAPE_26 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.25, 16 * 0.8125, 16 * 0.75, 16 * 0.3125, 16 * 0.875), Direction.SOUTH));
        final VoxelShape[] SHAPE_27 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5, 16 * 0.25, 16 * 0.9375, 16 * 0.75, 16 * 0.375, 16 * 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_28 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5, 16 * 0.3125, 16 * 0.375, 16 * 0.75, 16 * 0.375, 16 * 0.75), Direction.SOUTH));
        final VoxelShape[] SHAPE_29 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5625, 16 * 0.3125, 16 * 0.75, 16 * 0.6875, 16 * 0.375, 16 * 0.8125), Direction.SOUTH));
        final VoxelShape[] SHAPE_30 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.125, 16 * 0.1875, 16 * 0.0625, 16 * 0.25, 16 * 0.25, 16 * 0.125), Direction.SOUTH));
        final VoxelShape[] SHAPE_31 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.125, 16 * 0.25, 16 * 0, 16 * 0.25, 16 * 0.375, 16 * 0.125), Direction.SOUTH));
        final VoxelShape[] SHAPE_32 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.125, 16 * 0.25, 16 * 0.125, 16 * 0.3125, 16 * 0.375, 16 * 0.1875), Direction.SOUTH));
        final VoxelShape[] SHAPE_33 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.25, 16 * 0.3125, 16 * 0.0625, 16 * 0.3125, 16 * 0.375, 16 * 0.125), Direction.SOUTH));
        final VoxelShape[] SHAPE_34 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.25, 16 * 0.3125, 16 * 0.1875, 16 * 0.3125, 16 * 0.375, 16 * 0.5625), Direction.SOUTH));
        final VoxelShape[] SHAPE_35 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.1875, 16 * 0.3125, 16 * 0.1875, 16 * 0.25, 16 * 0.375, 16 * 0.4375), Direction.SOUTH));
        final VoxelShape[] SHAPE_36 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.125, 16 * 0.3125, 16 * 0.1875, 16 * 0.1875, 16 * 0.375, 16 * 0.25), Direction.SOUTH));
        final VoxelShape[] SHAPE_37 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.1875, 16 * 0.375, 16 * 0.0625, 16 * 0.3125, 16 * 0.4375, 16 * 0.4375), Direction.SOUTH));
        final VoxelShape[] SHAPE_38 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.125, 16 * 0.375, 16 * 0.125, 16 * 0.1875, 16 * 0.4375, 16 * 0.25), Direction.SOUTH));
        final VoxelShape[] SHAPE_39 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.1875, 16 * 0.375, 16 * 0.4375, 16 * 0.3125, 16 * 0.4375, 16 * 0.5), Direction.SOUTH));
        final VoxelShape[] SHAPE_40 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.375, 16 * 0.25, 16 * 0.625, 16 * 0.4375, 16 * 0.5625), Direction.SOUTH));
        final VoxelShape[] SHAPE_41 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.375, 16 * 0.375, 16 * 0.5625, 16 * 0.75, 16 * 0.4375, 16 * 0.6875), Direction.SOUTH));
        final VoxelShape[] SHAPE_42 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.625, 16 * 0.375, 16 * 0.4375, 16 * 0.75, 16 * 0.4375, 16 * 0.5625), Direction.SOUTH));
        final VoxelShape[] SHAPE_43 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.625, 16 * 0.375, 16 * 0.3125, 16 * 0.6875, 16 * 0.4375, 16 * 0.4375), Direction.SOUTH));
        final VoxelShape[] SHAPE_44 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.75, 16 * 0.375, 16 * 0.5, 16 * 0.8125, 16 * 0.4375, 16 * 0.6875), Direction.SOUTH));
        final VoxelShape[] SHAPE_45 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.4375, 16 * 0.375, 16 * 0.6875, 16 * 0.75, 16 * 0.4375, 16 * 0.75), Direction.SOUTH));
        final VoxelShape[] SHAPE_46 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5625, 16 * 0.375, 16 * 0.75, 16 * 0.625, 16 * 0.4375, 16 * 0.8125), Direction.SOUTH));
        final VoxelShape[] SHAPE_47 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5625, 16 * 0.375, 16 * 0.9375, 16 * 0.6875, 16 * 0.4375, 16 * 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_48 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.4375, 16 * 0.3125, 16 * 0.625, 16 * 0.5, 16 * 0.5), Direction.SOUTH));
        final VoxelShape[] SHAPE_49 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.625, 16 * 0.4375, 16 * 0.375, 16 * 0.6875, 16 * 0.5, 16 * 0.8125), Direction.SOUTH));
        final VoxelShape[] SHAPE_50 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.4375, 16 * 0.4375, 16 * 0.75, 16 * 0.5, 16 * 0.8125), Direction.SOUTH));
        final VoxelShape[] SHAPE_51 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.75, 16 * 0.4375, 16 * 0.5, 16 * 0.8125, 16 * 0.5, 16 * 0.8125), Direction.SOUTH));
        final VoxelShape[] SHAPE_52 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.375, 16 * 0.4375, 16 * 0.5, 16 * 0.625, 16 * 0.5, 16 * 0.625), Direction.SOUTH));
        final VoxelShape[] SHAPE_53 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.4375, 16 * 0.4375, 16 * 0.625, 16 * 0.75, 16 * 0.5, 16 * 0.6875), Direction.SOUTH));
        final VoxelShape[] SHAPE_54 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.5625, 16 * 0.4375, 16 * 0.6875, 16 * 0.6875, 16 * 0.5, 16 * 0.75), Direction.SOUTH));
        final VoxelShape[] SHAPE_55 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.25, 16 * 0.4375, 16 * 0.375, 16 * 0.3125, 16 * 0.5, 16 * 0.4375), Direction.SOUTH));
        final VoxelShape[] SHAPE_56 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.1875, 16 * 0.4375, 16 * 0.1875, 16 * 0.3125, 16 * 0.5, 16 * 0.375), Direction.SOUTH));
        final VoxelShape[] SHAPE_57 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.1875, 16 * 0.4375, 16 * 0.125, 16 * 0.25, 16 * 0.5, 16 * 0.1875), Direction.SOUTH));
        final VoxelShape[] SHAPE_58 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.4375, 16 * 0.25, 16 * 0.375, 16 * 0.5, 16 * 0.3125), Direction.SOUTH));
        final VoxelShape[] SHAPE_59 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.5, 16 * 0.4375, 16 * 0.6875, 16 * 0.5625, 16 * 0.6875), Direction.SOUTH));
        final VoxelShape[] SHAPE_60 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.375, 16 * 0.5, 16 * 0.375, 16 * 0.625, 16 * 0.5625, 16 * 0.4375), Direction.SOUTH));
        final VoxelShape[] SHAPE_61 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.4375, 16 * 0.5, 16 * 0.6875, 16 * 0.5625, 16 * 0.5625, 16 * 0.875), Direction.SOUTH));
        final VoxelShape[] SHAPE_62 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.5, 16 * 0.5625, 16 * 0.8125, 16 * 0.5625, 16 * 0.875), Direction.SOUTH));
        final VoxelShape[] SHAPE_63 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.8125, 16 * 0.5, 16 * 0.6875, 16 * 0.875, 16 * 0.5625, 16 * 0.8125), Direction.SOUTH));
        final VoxelShape[] SHAPE_64 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.625, 16 * 0.5, 16 * 0.6875, 16 * 0.6875, 16 * 0.5625, 16 * 0.8125), Direction.SOUTH));
        final VoxelShape[] SHAPE_65 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.625, 16 * 0.5625, 16 * 0.6875, 16 * 0.875, 16 * 0.625, 16 * 0.8125), Direction.SOUTH));
        final VoxelShape[] SHAPE_66 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.5625, 16 * 0.8125, 16 * 0.875, 16 * 0.625, 16 * 0.875), Direction.SOUTH));
        final VoxelShape[] SHAPE_67 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.75, 16 * 0.5625, 16 * 0.875, 16 * 0.8125, 16 * 0.625, 16 * 0.9375), Direction.SOUTH));
        final VoxelShape[] SHAPE_68 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.5625, 16 * 0.375, 16 * 0.75, 16 * 0.625, 16 * 0.6875), Direction.SOUTH));
        final VoxelShape[] SHAPE_69 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.25, 16 * 0.5625, 16 * 0.4375, 16 * 0.3125, 16 * 0.625, 16 * 0.75), Direction.SOUTH));
        final VoxelShape[] SHAPE_70 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.5625, 16 * 0.3125, 16 * 0.6875, 16 * 0.625, 16 * 0.375), Direction.SOUTH));
        final VoxelShape[] SHAPE_71 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.625, 16 * 0.5625, 16 * 0.25, 16 * 0.6875, 16 * 0.625, 16 * 0.3125), Direction.SOUTH));
        final VoxelShape[] SHAPE_72 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.4375, 16 * 0.5625, 16 * 0.25, 16 * 0.5625, 16 * 0.625, 16 * 0.3125), Direction.SOUTH));
        final VoxelShape[] SHAPE_73 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.5625, 16 * 0.25, 16 * 0.375, 16 * 0.625, 16 * 0.3125), Direction.SOUTH));
        final VoxelShape[] SHAPE_74 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.5625, 16 * 0.6875, 16 * 0.625, 16 * 0.625, 16 * 0.8125), Direction.SOUTH));
        final VoxelShape[] SHAPE_75 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.375, 16 * 0.5625, 16 * 0.8125, 16 * 0.625, 16 * 0.6875, 16 * 0.875), Direction.SOUTH));
        final VoxelShape[] SHAPE_76 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.625, 16 * 0.3125, 16 * 0.6875, 16 * 0.6875, 16 * 0.75), Direction.SOUTH));
        final VoxelShape[] SHAPE_77 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.375, 16 * 0.625, 16 * 0.75, 16 * 0.625, 16 * 0.6875, 16 * 0.8125), Direction.SOUTH));
        final VoxelShape[] SHAPE_78 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.4375, 16 * 0.625, 16 * 0.875, 16 * 0.5625, 16 * 0.6875, 16 * 0.9375), Direction.SOUTH));
        final VoxelShape[] SHAPE_79 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.25, 16 * 0.625, 16 * 0.375, 16 * 0.3125, 16 * 0.6875, 16 * 0.625), Direction.SOUTH));
        final VoxelShape[] SHAPE_80 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.1875, 16 * 0.625, 16 * 0.3125, 16 * 0.3125, 16 * 0.6875, 16 * 0.375), Direction.SOUTH));
        final VoxelShape[] SHAPE_81 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.625, 16 * 0.25, 16 * 0.6875, 16 * 0.6875, 16 * 0.3125), Direction.SOUTH));
        final VoxelShape[] SHAPE_82 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.625, 16 * 0.3125, 16 * 0.8125, 16 * 0.6875, 16 * 0.375), Direction.SOUTH));
        final VoxelShape[] SHAPE_83 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.625, 16 * 0.375, 16 * 0.75, 16 * 0.6875, 16 * 0.625), Direction.SOUTH));
        final VoxelShape[] SHAPE_84 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.625, 16 * 0.75, 16 * 0.875, 16 * 0.6875, 16 * 0.9375), Direction.SOUTH));
        final VoxelShape[] SHAPE_85 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.75, 16 * 0.625, 16 * 0.9375, 16 * 0.8125, 16 * 0.6875, 16 * 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_86 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.75, 16 * 0.6875, 16 * 0.75, 16 * 0.8125, 16 * 0.75, 16 * 0.8125), Direction.SOUTH));
        final VoxelShape[] SHAPE_87 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.6875, 16 * 0.8125, 16 * 0.875, 16 * 0.75, 16 * 0.9375), Direction.SOUTH));
        final VoxelShape[] SHAPE_88 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.6875, 16 * 0.9375, 16 * 0.8125, 16 * 0.75, 16 * 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_89 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.25, 16 * 0.6875, 16 * 0.375, 16 * 0.75, 16 * 0.75, 16 * 0.5625), Direction.SOUTH));
        final VoxelShape[] SHAPE_90 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.1875, 16 * 0.6875, 16 * 0.3125, 16 * 0.8125, 16 * 0.75, 16 * 0.375), Direction.SOUTH));
        final VoxelShape[] SHAPE_91 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.375, 16 * 0.6875, 16 * 0.25, 16 * 0.625, 16 * 0.75, 16 * 0.3125), Direction.SOUTH));
        final VoxelShape[] SHAPE_92 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.6875, 16 * 0.5625, 16 * 0.6875, 16 * 0.8125, 16 * 0.625), Direction.SOUTH));
        final VoxelShape[] SHAPE_93 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.375, 16 * 0.6875, 16 * 0.625, 16 * 0.625, 16 * 0.8125, 16 * 0.6875), Direction.SOUTH));
        final VoxelShape[] SHAPE_94 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.4375, 16 * 0.6875, 16 * 0.6875, 16 * 0.5625, 16 * 0.75, 16 * 0.8125), Direction.SOUTH));
        final VoxelShape[] SHAPE_95 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.75, 16 * 0.3125, 16 * 0.6875, 16 * 0.8125, 16 * 0.5625), Direction.SOUTH));
        final VoxelShape[] SHAPE_96 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.75, 16 * 0.375, 16 * 0.75, 16 * 0.8125, 16 * 0.5), Direction.SOUTH));
        final VoxelShape[] SHAPE_97 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.25, 16 * 0.75, 16 * 0.375, 16 * 0.3125, 16 * 0.8125, 16 * 0.5), Direction.SOUTH));
        final VoxelShape[] SHAPE_98 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.4375, 16 * 0.75, 16 * 0.6875, 16 * 0.5625, 16 * 0.8125, 16 * 0.75), Direction.SOUTH));
        final VoxelShape[] SHAPE_99 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.75, 16 * 0.8125, 16 * 0.8125, 16 * 0.8125, 16 * 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_100 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.8125, 16 * 0.75, 16 * 0.875, 16 * 0.875, 16 * 0.8125, 16 * 0.9375), Direction.SOUTH));
        final VoxelShape[] SHAPE_101 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.8125, 16 * 0.8125, 16 * 0.8125, 16 * 0.875, 16 * 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_102 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.625, 16 * 0.8125, 16 * 0.8125, 16 * 0.6875, 16 * 0.875, 16 * 0.875), Direction.SOUTH));
        final VoxelShape[] SHAPE_103 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.4375, 16 * 0.8125, 16 * 0.8125, 16 * 0.5625, 16 * 0.875, 16 * 0.875), Direction.SOUTH));
        final VoxelShape[] SHAPE_104 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.375, 16 * 0.8125, 16 * 0.3125, 16 * 0.625, 16 * 0.875, 16 * 0.8125), Direction.SOUTH));
        final VoxelShape[] SHAPE_105 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.8125, 16 * 0.375, 16 * 0.375, 16 * 0.875, 16 * 0.6875), Direction.SOUTH));
        final VoxelShape[] SHAPE_106 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.625, 16 * 0.8125, 16 * 0.375, 16 * 0.6875, 16 * 0.875, 16 * 0.6875), Direction.SOUTH));
        final VoxelShape[] SHAPE_107 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.8125, 16 * 0.4375, 16 * 0.75, 16 * 0.875, 16 * 0.625), Direction.SOUTH));
        final VoxelShape[] SHAPE_108 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.25, 16 * 0.8125, 16 * 0.4375, 16 * 0.3125, 16 * 0.875, 16 * 0.625), Direction.SOUTH));
        final VoxelShape[] SHAPE_109 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.3125, 16 * 0.875, 16 * 0.4375, 16 * 0.375, 16 * 0.9375, 16 * 0.625), Direction.SOUTH));
        final VoxelShape[] SHAPE_110 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.625, 16 * 0.875, 16 * 0.4375, 16 * 0.6875, 16 * 0.9375, 16 * 0.625), Direction.SOUTH));
        final VoxelShape[] SHAPE_111 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.375, 16 * 0.875, 16 * 0.375, 16 * 0.625, 16 * 0.9375, 16 * 0.6875), Direction.SOUTH));
        final VoxelShape[] SHAPE_112 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.625, 16 * 0.875, 16 * 0.8125, 16 * 0.8125, 16 * 0.9375, 16 * 0.9375), Direction.SOUTH));
        final VoxelShape[] SHAPE_113 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.875, 16 * 0.9375, 16 * 0.8125, 16 * 0.9375, 16 * 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_114 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.625, 16 * 0.9375, 16 * 0.8125, 16 * 0.75, 16 * 1, 16 * 0.9375), Direction.SOUTH));
        final VoxelShape[] SHAPE_115 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.6875, 16 * 0.9375, 16 * 0.9375, 16 * 0.75, 16 * 1, 16 * 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_116 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16 * 0.75, 16 * 0.9375, 16 * 0.875, 16 * 0.8125, 16 * 1, 16 * 0.9375), Direction.SOUTH));
        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for(BlockState state : states)
        {
            Direction direction = state.getValue(DIRECTION);
            List<VoxelShape> shapes = new ArrayList<>();
            shapes.add(SHAPE_1[direction.get2DDataValue()]);
            shapes.add(SHAPE_2[direction.get2DDataValue()]);
            shapes.add(SHAPE_3[direction.get2DDataValue()]);
            shapes.add(SHAPE_4[direction.get2DDataValue()]);
            shapes.add(SHAPE_5[direction.get2DDataValue()]);
            shapes.add(SHAPE_6[direction.get2DDataValue()]);
            shapes.add(SHAPE_7[direction.get2DDataValue()]);
            shapes.add(SHAPE_8[direction.get2DDataValue()]);
            shapes.add(SHAPE_9[direction.get2DDataValue()]);
            shapes.add(SHAPE_10[direction.get2DDataValue()]);
            shapes.add(SHAPE_11[direction.get2DDataValue()]);
            shapes.add(SHAPE_12[direction.get2DDataValue()]);
            shapes.add(SHAPE_13[direction.get2DDataValue()]);
            shapes.add(SHAPE_14[direction.get2DDataValue()]);
            shapes.add(SHAPE_15[direction.get2DDataValue()]);
            shapes.add(SHAPE_16[direction.get2DDataValue()]);
            shapes.add(SHAPE_17[direction.get2DDataValue()]);
            shapes.add(SHAPE_18[direction.get2DDataValue()]);
            shapes.add(SHAPE_19[direction.get2DDataValue()]);
            shapes.add(SHAPE_20[direction.get2DDataValue()]);
            shapes.add(SHAPE_21[direction.get2DDataValue()]);
            shapes.add(SHAPE_22[direction.get2DDataValue()]);
            shapes.add(SHAPE_23[direction.get2DDataValue()]);
            shapes.add(SHAPE_24[direction.get2DDataValue()]);
            shapes.add(SHAPE_25[direction.get2DDataValue()]);
            shapes.add(SHAPE_26[direction.get2DDataValue()]);
            shapes.add(SHAPE_27[direction.get2DDataValue()]);
            shapes.add(SHAPE_28[direction.get2DDataValue()]);
            shapes.add(SHAPE_29[direction.get2DDataValue()]);
            shapes.add(SHAPE_30[direction.get2DDataValue()]);
            shapes.add(SHAPE_31[direction.get2DDataValue()]);
            shapes.add(SHAPE_32[direction.get2DDataValue()]);
            shapes.add(SHAPE_33[direction.get2DDataValue()]);
            shapes.add(SHAPE_34[direction.get2DDataValue()]);
            shapes.add(SHAPE_35[direction.get2DDataValue()]);
            shapes.add(SHAPE_36[direction.get2DDataValue()]);
            shapes.add(SHAPE_37[direction.get2DDataValue()]);
            shapes.add(SHAPE_38[direction.get2DDataValue()]);
            shapes.add(SHAPE_39[direction.get2DDataValue()]);
            shapes.add(SHAPE_40[direction.get2DDataValue()]);
            shapes.add(SHAPE_41[direction.get2DDataValue()]);
            shapes.add(SHAPE_42[direction.get2DDataValue()]);
            shapes.add(SHAPE_43[direction.get2DDataValue()]);
            shapes.add(SHAPE_44[direction.get2DDataValue()]);
            shapes.add(SHAPE_45[direction.get2DDataValue()]);
            shapes.add(SHAPE_46[direction.get2DDataValue()]);
            shapes.add(SHAPE_47[direction.get2DDataValue()]);
            shapes.add(SHAPE_48[direction.get2DDataValue()]);
            shapes.add(SHAPE_49[direction.get2DDataValue()]);
            shapes.add(SHAPE_50[direction.get2DDataValue()]);
            shapes.add(SHAPE_51[direction.get2DDataValue()]);
            shapes.add(SHAPE_52[direction.get2DDataValue()]);
            shapes.add(SHAPE_53[direction.get2DDataValue()]);
            shapes.add(SHAPE_54[direction.get2DDataValue()]);
            shapes.add(SHAPE_55[direction.get2DDataValue()]);
            shapes.add(SHAPE_56[direction.get2DDataValue()]);
            shapes.add(SHAPE_57[direction.get2DDataValue()]);
            shapes.add(SHAPE_58[direction.get2DDataValue()]);
            shapes.add(SHAPE_59[direction.get2DDataValue()]);
            shapes.add(SHAPE_60[direction.get2DDataValue()]);
            shapes.add(SHAPE_61[direction.get2DDataValue()]);
            shapes.add(SHAPE_62[direction.get2DDataValue()]);
            shapes.add(SHAPE_63[direction.get2DDataValue()]);
            shapes.add(SHAPE_64[direction.get2DDataValue()]);
            shapes.add(SHAPE_65[direction.get2DDataValue()]);
            shapes.add(SHAPE_66[direction.get2DDataValue()]);
            shapes.add(SHAPE_67[direction.get2DDataValue()]);
            shapes.add(SHAPE_68[direction.get2DDataValue()]);
            shapes.add(SHAPE_69[direction.get2DDataValue()]);
            shapes.add(SHAPE_70[direction.get2DDataValue()]);
            shapes.add(SHAPE_71[direction.get2DDataValue()]);
            shapes.add(SHAPE_72[direction.get2DDataValue()]);
            shapes.add(SHAPE_73[direction.get2DDataValue()]);
            shapes.add(SHAPE_74[direction.get2DDataValue()]);
            shapes.add(SHAPE_75[direction.get2DDataValue()]);
            shapes.add(SHAPE_76[direction.get2DDataValue()]);
            shapes.add(SHAPE_77[direction.get2DDataValue()]);
            shapes.add(SHAPE_78[direction.get2DDataValue()]);
            shapes.add(SHAPE_79[direction.get2DDataValue()]);
            shapes.add(SHAPE_80[direction.get2DDataValue()]);
            shapes.add(SHAPE_81[direction.get2DDataValue()]);
            shapes.add(SHAPE_82[direction.get2DDataValue()]);
            shapes.add(SHAPE_83[direction.get2DDataValue()]);
            shapes.add(SHAPE_84[direction.get2DDataValue()]);
            shapes.add(SHAPE_85[direction.get2DDataValue()]);
            shapes.add(SHAPE_86[direction.get2DDataValue()]);
            shapes.add(SHAPE_87[direction.get2DDataValue()]);
            shapes.add(SHAPE_88[direction.get2DDataValue()]);
            shapes.add(SHAPE_89[direction.get2DDataValue()]);
            shapes.add(SHAPE_90[direction.get2DDataValue()]);
            shapes.add(SHAPE_91[direction.get2DDataValue()]);
            shapes.add(SHAPE_92[direction.get2DDataValue()]);
            shapes.add(SHAPE_93[direction.get2DDataValue()]);
            shapes.add(SHAPE_94[direction.get2DDataValue()]);
            shapes.add(SHAPE_95[direction.get2DDataValue()]);
            shapes.add(SHAPE_96[direction.get2DDataValue()]);
            shapes.add(SHAPE_97[direction.get2DDataValue()]);
            shapes.add(SHAPE_98[direction.get2DDataValue()]);
            shapes.add(SHAPE_99[direction.get2DDataValue()]);
            shapes.add(SHAPE_100[direction.get2DDataValue()]);
            shapes.add(SHAPE_101[direction.get2DDataValue()]);
            shapes.add(SHAPE_102[direction.get2DDataValue()]);
            shapes.add(SHAPE_103[direction.get2DDataValue()]);
            shapes.add(SHAPE_104[direction.get2DDataValue()]);
            shapes.add(SHAPE_105[direction.get2DDataValue()]);
            shapes.add(SHAPE_106[direction.get2DDataValue()]);
            shapes.add(SHAPE_107[direction.get2DDataValue()]);
            shapes.add(SHAPE_108[direction.get2DDataValue()]);
            shapes.add(SHAPE_109[direction.get2DDataValue()]);
            shapes.add(SHAPE_110[direction.get2DDataValue()]);
            shapes.add(SHAPE_111[direction.get2DDataValue()]);
            shapes.add(SHAPE_112[direction.get2DDataValue()]);
            shapes.add(SHAPE_113[direction.get2DDataValue()]);
            shapes.add(SHAPE_114[direction.get2DDataValue()]);
            shapes.add(SHAPE_115[direction.get2DDataValue()]);
            shapes.add(SHAPE_116[direction.get2DDataValue()]);
            builder.put(state, VoxelShapeHelper.combineAll(shapes));
        }
        return builder.build();
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context)
    {
        return SHAPES.get(state);
    }

    @Override
    public VoxelShape getOcclusionShape(BlockState state, BlockGetter reader, BlockPos pos)
    {
        return SHAPES.get(state);
    }
}