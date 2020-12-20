package org.lab3;

import static org.junit.jupiter.api.Assertions.*;


import net.iharder.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Random;


import org.junit.jupiter.api.Test;

public class Base64Test {

  private static final long SEED = 12345678;
  private static Random s_random = new Random(SEED);

  private byte[] createData(int length) throws Exception {
    byte[] bytes = new byte[length];
    s_random.nextBytes(bytes);
    return bytes;
  }

  @Test
  void runStreamTest() throws Exception {
    int length  = 123123;
    byte[] data = createData(length);
    ByteArrayOutputStream out_bytes = new ByteArrayOutputStream();
    OutputStream out = new Base64.OutputStream(out_bytes);
    out.write(data);
    out.close();
    byte[] encoded = out_bytes.toByteArray();
    byte[] decoded = Base64.decode(encoded, 0, encoded.length,
        Base64.NO_OPTIONS);
    assertTrue(Arrays.equals(data, decoded));

    Base64.InputStream in = new Base64.InputStream(new ByteArrayInputStream(encoded));
    out_bytes = new ByteArrayOutputStream();
    byte[] buffer = new byte[3];
    for (int n = in.read(buffer); n > 0; n = in.read(buffer)) {
      out_bytes.write(buffer, 0, n);
    }
    out_bytes.close();
    in.close();
    decoded = out_bytes.toByteArray();
    assertTrue(Arrays.equals(data, decoded));
  }


}
