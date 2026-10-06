package api.LanceNestAPI.src.util;

import org.joml.Vector3f;

import net.minecraft.nbt.CompoundTag;

public class NBTUtil {
	public static CompoundTag Vec3FtoTag(Vector3f vec) {
		CompoundTag tag = new CompoundTag();

		tag.putFloat("x", vec.x);
		tag.putFloat("y", vec.y);
		tag.putFloat("z", vec.z);

		return tag;
	}

	public static Vector3f TagToVec3F(CompoundTag tag) {
		Vector3f vec = new Vector3f();

		vec.x = tag.getFloat("x");
		vec.y = tag.getFloat("y");
		vec.z = tag.getFloat("z");

		return vec;
	}
}
