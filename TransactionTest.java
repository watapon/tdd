testCompleteTransaction() {
  Server writer = new Server(defaultPort(), "abc");
  Socket reader = new Socket("localhost", defaultPort());
  Buffer reply = reader.contents());
  assertTrue(reader.isClosed());
  assertEquals("abc", reply.contents());
}
