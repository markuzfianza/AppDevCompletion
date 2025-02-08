public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
      String phoneNum = "(";
        for (int i = 0; i < numbers.length; i++) {
          if (i == 2) {
            phoneNum += numbers[i] + ") ";
          } else if (i == 5) {
              phoneNum += numbers[i] + "-";
          } else {
            phoneNum += numbers[i];
          }
        }
      return phoneNum;
    }
  }
  