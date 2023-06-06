# Profile Registration Test Report

This test report provides an overview of the test cases performed for the profile registration program.

## Test Cases

### Test Case 1: Verify Successful Registration

- **Description**: Verify that the user can register successfully by providing valid inputs.
- **Test Steps**:
  1. Enter a valid name, age, email address, phone number, and address.
  2. Submit the registration form.
  3. Verify that the program displays the registered profile details correctly.
- **Expected Result**: The program should display the registered profile details without any errors.
- **Actual Result**: The test case passed without any issues.

### Test Case 2: Verify Validation for Invalid Inputs

- **Description**: Verify that the program validates user inputs and provides appropriate error messages for invalid inputs.
- **Test Steps**:
  1. Enter an empty name and submit the registration form.
  2. Verify that the program displays an error message for the empty name field.
  3. Repeat the above steps for age, email address, phone number, and address fields, testing for invalid inputs such as negative age, invalid email format, empty phone number, etc.
- **Expected Result**: The program should display specific error messages for each invalid input field.
- **Actual Result**: The test case passed, and the program displayed appropriate error messages for each invalid input field.

### Test Case 3: Verify Maximum Input Length

- **Description**: Verify that the program handles and truncates input values that exceed the maximum allowed length for each field.
- **Test Steps**:
  1. Enter a name, age, email address, phone number, and address that exceed the maximum length.
  2. Submit the registration form.
  3. Verify that the program truncates the input values to the maximum allowed length and displays the registered profile details correctly.
- **Expected Result**: The program should truncate input values that exceed the maximum allowed length and display the truncated profile details without any errors.
- **Actual Result**: The test case passed, and the program truncated input values that exceeded the maximum allowed length.

## Conclusion

The profile registration program was tested using various test cases to ensure its functionality and reliability. All test cases were executed, and the program performed as expected, providing accurate registration results and handling invalid inputs appropriately.

Overall, the program demonstrates proper registration functionality and validation mechanisms, making it a reliable tool for capturing user profile information.

For detailed test case steps and results, refer to the individual test case files in the QA Testing Sample/Test cases folder.

Please note that this test report provides a high-level summary. For in-depth testing documentation, including test scripts, test data, and additional observations, please contact me for further details.


