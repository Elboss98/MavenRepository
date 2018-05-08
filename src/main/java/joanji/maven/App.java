public class App {

    public static void compress(InputStream is, OutputStream os) throws Exception {

        int bytes;
        int last_byts = is.read();
        int count = -1;

        while ((bytes = is.read()) != -1) {
            if (bytes == last_byts) {
                if (count == 255) {
                    comprovarRepeticioCompress(os, last_byts, count);
                    count = -1;
                } else {
                    count++;
                }
            } else {
                comprovarRepeticioCompress(os, last_byts, count);
                count = -1;
            }
            last_byts = bytes;
        }
        comprovarRepeticioCompress(os, last_byts, count);
        os.close();
    }

    private static void comprovarRepeticioCompress(OutputStream os, int last_byts, int count) throws IOException {
        if (count >= 0) {
            os.write(last_byts);
            os.write(last_byts);
            os.write(count);
        } else {
            os.write(last_byts);
        }
    }

    public static void decompress(InputStream is, OutputStream os) throws IOException {

        int bytes;
        int last_byts = is.read();
        boolean comprovarRepetides = false;

        while ((bytes = is.read()) != -1) {
            if (bytes == last_byts) {
                comprovarRepetides = true;
            } else {
                if (comprovarRepetides) {
                    os.write(last_byts);
                    os.write(last_byts);
                    for (int i = 0; i < bytes; i++) {
                        os.write(last_byts);
                    }
                    bytes =  is.read();
                    comprovarRepetides = false;
                } else {
                    os.write(last_byts);
                }
            }
            last_byts = bytes;
        }
        if (last_byts != -1) {
            os.write(last_byts);
        }
        os.close();
    }
}
