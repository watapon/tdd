@Test
public void testFileSystemError() {
    File f = new FullFile("foo") {
        public boolean createNewFile() throws IOException {
            throw new IOException();
        }
    };

    try {
        saveAs(f);
        fail();
    }  catch (IOException e) {
    }
}
