import lombok.Value;
@Value record ValueOnRecord(String a, String b) {
/* Implicit */  private final String a;
/* Implicit */  private final String b;
  public ValueOnRecord(String a, String b) {
    super();
    .a = a;
    .b = b;
  }
}
