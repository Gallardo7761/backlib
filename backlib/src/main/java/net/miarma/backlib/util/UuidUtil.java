package net.miarma.backlib.util;

import java.nio.ByteBuffer;
import java.util.UUID;

public class UuidUtil {
	public static byte[] uuidToBin(UUID uuid) {
	    ByteBuffer bb = ByteBuffer.allocate(16);
	    bb.putLong(uuid.getMostSignificantBits());
	    bb.putLong(uuid.getLeastSignificantBits());
	    return bb.array();
	}
	
	public static UUID binToUUID(byte[] bin) {
	    ByteBuffer bb = ByteBuffer.wrap(bin);
	    long high = bb.getLong();
	    long low = bb.getLong();
	    return new UUID(high, low);
	}

}
