## @Bean Validation project example

This is a @Bean validation example for learning purposes.

In this documentation You'll find how to run the project and detailed documentation to dive in the topic.

📋 Common Validation Annotations

Here’s a quick reference of the most widely used bean validation constraints:

| Annotation         | Description                                                                               | Example                                                    |
| ------------------ | ----------------------------------------------------------------------------------------- | ---------------------------------------------------------- |
| `@NotNull`         | Field must not be `null` (but can be empty for strings/collections).                      | `@NotNull private String name;`                            |
| `@NotBlank`        | Field must not be `null` **and** must contain at least one non-whitespace character.      | `@NotBlank private String username;`                       |
| `@NotEmpty`        | Field must not be `null` and must not be empty (applies to strings, collections, arrays). | `@NotEmpty private List<String> roles;`                    |
| `@Email`           | Must be a valid email format.                                                             | `@Email private String email;`                             |
| `@Pattern`         | Must match a given regular expression.                                                    | `@Pattern(regexp="\\d{10}") private String phone;`         |
| `@Size`            | Validates string/collection/array/map size within a range.                                | `@Size(min=2, max=30) private String name;`                |
| `@Min`             | Must be greater than or equal to a given value.                                           | `@Min(18) private int age;`                                |
| `@Max`             | Must be less than or equal to a given value.                                              | `@Max(100) private int score;`                             |
| `@Positive`        | Must be strictly greater than 0.                                                          | `@Positive private int quantity;`                          |
| `@PositiveOrZero`  | Must be 0 or greater.                                                                     | `@PositiveOrZero private int stock;`                       |
| `@Negative`        | Must be strictly less than 0.                                                             | `@Negative private int debt;`                              |
| `@NegativeOrZero`  | Must be 0 or less.                                                                        | `@NegativeOrZero private int balance;`                     |
| `@Future`          | Must be a date/time in the future.                                                        | `@Future private LocalDate appointmentDate;`               |
| `@Past`            | Must be a date/time in the past.                                                          | `@Past private LocalDate birthDate;`                       |
| `@FutureOrPresent` | Must be today or a future date/time.                                                      | `@FutureOrPresent private LocalDate deadline;`             |
| `@PastOrPresent`   | Must be today or a past date/time.                                                        | `@PastOrPresent private LocalDate joinedAt;`               |
| `@Digits`          | Restricts numeric values to certain integer/fraction length.                              | `@Digits(integer=5, fraction=2) private BigDecimal price;` |
| `@DecimalMin`      | Must be greater than or equal to the given decimal.                                       | `@DecimalMin("0.01") private BigDecimal price;`            |
| `@DecimalMax`      | Must be less than or equal to the given decimal.                                          | `@DecimalMax("999.99") private BigDecimal price;`          |
| `@AssertTrue`      | Must be `true`.                                                                           | `@AssertTrue private boolean active;`                      |
| `@AssertFalse`     | Must be `false`.                                                                          | `@AssertFalse private boolean locked;`                     |
