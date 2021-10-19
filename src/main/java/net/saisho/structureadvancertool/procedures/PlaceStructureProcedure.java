package net.saisho.structureadvancertool.procedures;

import net.saisho.structureadvancertool.StructureAdvancerToolMod;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.BlockState;

import java.util.Map;

public class PlaceStructureProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				StructureAdvancerToolMod.LOGGER.warn("Failed to load dependency x for procedure PlaceStructure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				StructureAdvancerToolMod.LOGGER.warn("Failed to load dependency y for procedure PlaceStructure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				StructureAdvancerToolMod.LOGGER.warn("Failed to load dependency z for procedure PlaceStructure!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				StructureAdvancerToolMod.LOGGER.warn("Failed to load dependency world for procedure PlaceStructure!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((new Object() {
			public String getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "StructureName"))).equals("Cube")) || ((((new Object() {
			public String getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "StructureName"))).equals("Cube"))
				&& ((world instanceof World) ? ((World) world).isBlockPowered(new BlockPos((int) x, (int) y, (int) z)) : false)))) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("structure_advancer_tool", "cube"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if ((0 == 1)) {
			if ((Direction.UP == (new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (property != null)
							return _bs.get(property);
						return Direction.getFacingFromAxisDirection(
								_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
								Direction.AxisDirection.POSITIVE);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))))) {
				if (world instanceof ServerWorld) {
					Template template = ((ServerWorld) world).getStructureTemplateManager()
							.getTemplateDefaulted(new ResourceLocation("structure_advancer_tool", "cube"));
					if (template != null) {
						template.func_237144_a_((ServerWorld) world, new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0)),
								new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
								((World) world).rand);
					}
				}
			} else if ((Direction.DOWN == (new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (property != null)
							return _bs.get(property);
						return Direction.getFacingFromAxisDirection(
								_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
								Direction.AxisDirection.POSITIVE);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))))) {
				if (world instanceof ServerWorld) {
					Template template = ((ServerWorld) world).getStructureTemplateManager()
							.getTemplateDefaulted(new ResourceLocation("structure_advancer_tool", "cube"));
					if (template != null) {
						template.func_237144_a_((ServerWorld) world, new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)),
								new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
								((World) world).rand);
					}
				}
			} else if ((Direction.NORTH == (new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (property != null)
							return _bs.get(property);
						return Direction.getFacingFromAxisDirection(
								_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
								Direction.AxisDirection.POSITIVE);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))))) {
				if (world instanceof ServerWorld) {
					Template template = ((ServerWorld) world).getStructureTemplateManager()
							.getTemplateDefaulted(new ResourceLocation("structure_advancer_tool", "cube"));
					if (template != null) {
						template.func_237144_a_((ServerWorld) world, new BlockPos((int) (x + 0), (int) (y - 0), (int) (z - 1)),
								new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
								((World) world).rand);
					}
				}
			} else if ((Direction.SOUTH == (new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (property != null)
							return _bs.get(property);
						return Direction.getFacingFromAxisDirection(
								_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
								Direction.AxisDirection.POSITIVE);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))))) {
				if (world instanceof ServerWorld) {
					Template template = ((ServerWorld) world).getStructureTemplateManager()
							.getTemplateDefaulted(new ResourceLocation("structure_advancer_tool", "cube"));
					if (template != null) {
						template.func_237144_a_((ServerWorld) world, new BlockPos((int) (x + 0), (int) (y - 0), (int) (z + 1)),
								new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
								((World) world).rand);
					}
				}
			} else if ((Direction.EAST == (new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (property != null)
							return _bs.get(property);
						return Direction.getFacingFromAxisDirection(
								_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
								Direction.AxisDirection.POSITIVE);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))))) {
				if (world instanceof ServerWorld) {
					Template template = ((ServerWorld) world).getStructureTemplateManager()
							.getTemplateDefaulted(new ResourceLocation("structure_advancer_tool", "cube"));
					if (template != null) {
						template.func_237144_a_((ServerWorld) world, new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 0)),
								new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
								((World) world).rand);
					}
				}
			} else if ((Direction.WEST == (new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (property != null)
							return _bs.get(property);
						return Direction.getFacingFromAxisDirection(
								_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
								Direction.AxisDirection.POSITIVE);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))))) {
				if (world instanceof ServerWorld) {
					Template template = ((ServerWorld) world).getStructureTemplateManager()
							.getTemplateDefaulted(new ResourceLocation("structure_advancer_tool", "cube"));
					if (template != null) {
						template.func_237144_a_((ServerWorld) world, new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 0)),
								new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
								((World) world).rand);
					}
				}
			}
		}
	}
}
