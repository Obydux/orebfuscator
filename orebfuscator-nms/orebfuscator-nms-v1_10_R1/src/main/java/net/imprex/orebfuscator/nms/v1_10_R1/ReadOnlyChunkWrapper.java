package net.imprex.orebfuscator.nms.v1_10_R1;

import net.imprex.orebfuscator.nms.ReadOnlyChunk;
import net.minecraft.server.v1_10_R1.Chunk;

public class ReadOnlyChunkWrapper implements ReadOnlyChunk {

	private final Chunk chunk;

	ReadOnlyChunkWrapper(Chunk chunk) {
		this.chunk = chunk;
	}

	@Override
	public int getHeight(int x, int z) {
		return chunk.b(x & 0xF, z & 0xF) - 1;
	}

	@Override
	public int getBlockState(int x, int y, int z) {
		return NmsManager.getBlockId(chunk.a(x, y, z));
	}
}
