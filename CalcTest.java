@Test
public void testSum() {
    assertEquals(4, plus(3, 1));
    assertEquals(7, plus(3, 4));
}
private int plus(int augend, int addend) {
    return augend + augend;
}
