import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class library {

  /**static int n;

  static void quantity() {
    n = Integer.parseInt(JOptionPane.showInputDialog(null, "How many books do you want to borrow?", "Library", JOptionPane.QUESTION_MESSAGE));
  }**/

  public static void main(String args[]) {

    String author[] = new String [10];
      author[0] = "Author_1";
      author[1] = "Author_2";
      author[2] = "Author_3";
      author[3] = "Author_4";
      author[4] = "Author_5";
      author[5] = "Author_6";
      author[6] = "Author_7";
      author[7] = "Author_8";
      author[8] = "Author_9";
      author[9] = "Author_10";

    String book[] = new String[50];
      book[0] = "Book_1";
      book[1] = "Book_2";
      book[2] = "Book_3";
      book[3] = "Book_4";
      book[4] = "Book_5";

      book[5] = "Book_1";
      book[6] = "Book_2";
      book[7] = "Book_3";
      book[8] = "Book_4";
      book[9] = "Book_5";

      book[10] = "Book_1";
      book[11] = "Book_2";
      book[12] = "Book_3";
      book[13] = "Book_4";
      book[14] = "Book_5";

      book[15] = "Book_1";
      book[16] = "Book_2";
      book[17] = "Book_3";
      book[18] = "Book_4";
      book[19] = "Book_5";

      book[20] = "Book_1";
      book[21] = "Book_2";
      book[22] = "Book_3";
      book[23] = "Book_4";
      book[24] = "Book_5";

      book[25] = "Book_1";
      book[26] = "Book_2";
      book[27] = "Book_3";
      book[28] = "Book_4";
      book[29] = "Book_5";

      book[30] = "Book_1";
      book[31] = "Book_2";
      book[32] = "Book_3";
      book[33] = "Book_4";
      book[34] = "Book_5";

      book[35] = "Book_1";
      book[36] = "Book_2";
      book[37] = "Book_3";
      book[38] = "Book_4";
      book[39] = "Book_5";

      book[40] = "Book_1";
      book[41] = "Book_2";
      book[42] = "Book_3";
      book[43] = "Book_4";
      book[44] = "Book_5";

      book[45] = "Book_1";
      book[46] = "Book_2";
      book[47] = "Book_3";
      book[48] = "Book_4";
      book[49] = "Book_5";

    int ab[] = new int[]{0, 0, 0};
    int bb[] = new int[]{0, 0, 0};

    String an[] = new String[3];
    String bn[] = new String[3];

    int qc = 1;

    try {

    /**quantity();

    while (n > 3) {
      JOptionPane.showMessageDialog(null, "You can only borrow up to 3 books!", "Library", JOptionPane.WARNING_MESSAGE);
      quantity();
    }**/

    String arrangement[] = new String[3];
      arrangement[1] = "Second book:\n\n";
      arrangement[2] = "Third book:\n\n";

    String name, section;

    do {
      name = JOptionPane.showInputDialog(null, "Please enter your name.", "Library", JOptionPane.QUESTION_MESSAGE);
    } while (name.isEmpty());

    do {
      section = JOptionPane.showInputDialog(null, "Please enter your section.", "Library", JOptionPane.QUESTION_MESSAGE);
    } while (section.isEmpty());

    for (int i = 0; i < 3; i++) {

      do {
        if (i == 0) {
          ab[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
          "Choose an author:\n" +
          "1. " + author[0] + "\n" +
          "2. " + author[1] + "\n" +
          "3. " + author[2] + "\n" +
          "4. " + author[3] + "\n" +
          "5. " + author[4] + "\n" +
          "6. " + author[5] + "\n" +
          "7. " + author[6] + "\n" +
          "8. " + author[7] + "\n" +
          "9. " + author[8] + "\n" +
          "10. " + author[9],
          "Library", JOptionPane.PLAIN_MESSAGE));
        } else if (i > 0) {
          ab[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
          arrangement[i] +
          "Choose an author:\n" +
          "1. " + author[0] + "\n" +
          "2. " + author[1] + "\n" +
          "3. " + author[2] + "\n" +
          "4. " + author[3] + "\n" +
          "5. " + author[4] + "\n" +
          "6. " + author[5] + "\n" +
          "7. " + author[6] + "\n" +
          "8. " + author[7] + "\n" +
          "9. " + author[8] + "\n" +
          "10. " + author[9],
          "Library", JOptionPane.PLAIN_MESSAGE));
        }
      } while (ab[i] > 10);

        switch(ab[i]) {

          case 1:
            do {
              bb[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
              author[0] + ":\n\nChoose a book:\n" +
              "1. " + book[0] + "\n" +
              "2. " + book[1] + "\n" +
              "3. " + book[2] + "\n" +
              "4. " + book[3] + "\n" +
              "5. " + book[4],
              "Library", JOptionPane.PLAIN_MESSAGE));
            } while (bb[i] > 5);

            an[i] = author[0];

            switch (bb[i]) {
              case 1:
                bn[i] = book[0];
                break;
              case 2:
                bn[i] = book[1];
                break;
              case 3:
                bn[i] = book[2];
                break;
              case 4:
                bn[i] = book[3];
                break;
              case 5:
                bn[i] = book[4];
                break;
            }

            break;

          case 2:
            do {
              bb[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
              author[1] + ":\n\nChoose a book:\n" +
              "1. " + book[5] + "\n" +
              "2. " + book[6] + "\n" +
              "3. " + book[7] + "\n" +
              "4. " + book[8] + "\n" +
              "5. " + book[9],
              "Library", JOptionPane.PLAIN_MESSAGE));
            } while (bb[i] > 5);

            an[i] = author[1];

            switch (bb[i]) {
              case 1:
                bn[i] = book[5];
                break;
              case 2:
                bn[i] = book[6];
                break;
              case 3:
                bn[i] = book[7];
                break;
              case 4:
                bn[i] = book[8];
                break;
              case 5:
                bn[i] = book[9];
                break;
            }

            break;

          case 3:
            do {
              bb[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
              author[2] + ":\n\nChoose a book:\n" +
              "1. " + book[10] + "\n" +
              "2. " + book[11] + "\n" +
              "3. " + book[12] + "\n" +
              "4. " + book[13] + "\n" +
              "5. " + book[14],
              "Library", JOptionPane.PLAIN_MESSAGE));
            } while (bb[i] > 5);

            an[i] = author[2];

            switch (bb[i]) {
              case 1:
                bn[i] = book[10];
                break;
              case 2:
                bn[i] = book[11];
                break;
              case 3:
                bn[i] = book[12];
                break;
              case 4:
                bn[i] = book[13];
                break;
              case 5:
                bn[i] = book[14];
                break;
            }

            break;

          case 4:
            do {
              bb[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
              author[3] + ":\n\nChoose a book:\n" +
              "1. " + book[15] + "\n" +
              "2. " + book[16] + "\n" +
              "3. " + book[17] + "\n" +
              "4. " + book[18] + "\n" +
              "5. " + book[19],
              "Library", JOptionPane.PLAIN_MESSAGE));
            } while (bb[i] > 5);

            an[i] = author[3];

            switch (bb[i]) {
              case 1:
                bn[i] = book[15];
                break;
              case 2:
                bn[i] = book[16];
                break;
              case 3:
                bn[i] = book[17];
                break;
              case 4:
                bn[i] = book[18];
                break;
              case 5:
                bn[i] = book[19];
                break;
            }

            break;

          case 5:
            do {
              bb[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
              author[4] + ":\n\nChoose a book:\n" +
              "1. " + book[20] + "\n" +
              "2. " + book[21] + "\n" +
              "3. " + book[22] + "\n" +
              "4. " + book[23] + "\n" +
              "5. " + book[24],
              "Library", JOptionPane.PLAIN_MESSAGE));
            } while (bb[i] > 5);

            an[i] = author[4];

            switch (bb[i]) {
              case 1:
                bn[i] = book[20];
                break;
              case 2:
                bn[i] = book[21];
                break;
              case 3:
                bn[i] = book[22];
                break;
              case 4:
                bn[i] = book[23];
                break;
              case 5:
                bn[i] = book[24];
                break;
            }

            break;

          case 6:
            do {
              bb[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
              author[5] + ":\n\nChoose a book:\n" +
              "1. " + book[25] + "\n" +
              "2. " + book[26] + "\n" +
              "3. " + book[27] + "\n" +
              "4. " + book[28] + "\n" +
              "5. " + book[29],
              "Library", JOptionPane.PLAIN_MESSAGE));
            } while (bb[i] > 5);

            an[i] = author[5];

            switch (bb[i]) {
              case 1:
                bn[i] = book[25];
                break;
              case 2:
                bn[i] = book[26];
                break;
              case 3:
                bn[i] = book[27];
                break;
              case 4:
                bn[i] = book[28];
                break;
              case 5:
                bn[i] = book[29];
                break;
            }

            break;

          case 7:
            do {
              bb[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
              author[6] + ":\n\nChoose a book:\n" +
              "1. " + book[30] + "\n" +
              "2. " + book[31] + "\n" +
              "3. " + book[32] + "\n" +
              "4. " + book[33] + "\n" +
              "5. " + book[34],
              "Library", JOptionPane.PLAIN_MESSAGE));
            } while (bb[i] > 5);

            an[i] = author[6];

            switch (bb[i]) {
              case 1:
                bn[i] = book[30];
                break;
              case 2:
                bn[i] = book[31];
                break;
              case 3:
                bn[i] = book[32];
                break;
              case 4:
                bn[i] = book[33];
                break;
              case 5:
                bn[i] = book[34];
                break;
            }

            break;

          case 8:
            do {
              bb[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
              author[7] + ":\n\nChoose a book:\n" +
              "1. " + book[35] + "\n" +
              "2. " + book[36] + "\n" +
              "3. " + book[37] + "\n" +
              "4. " + book[38] + "\n" +
              "5. " + book[39],
              "Library", JOptionPane.PLAIN_MESSAGE));
            } while (bb[i] > 5);

            an[i] = author[7];

            switch (bb[i]) {
              case 1:
                bn[i] = book[35];
                break;
              case 2:
                bn[i] = book[36];
                break;
              case 3:
                bn[i] = book[37];
                break;
              case 4:
                bn[i] = book[38];
                break;
              case 5:
                bn[i] = book[39];
                break;
            }

            break;

          case 9:
            do {
              bb[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
              author[8] + ":\n\nChoose a book:\n" +
              "1. " + book[40] + "\n" +
              "2. " + book[41] + "\n" +
              "3. " + book[42] + "\n" +
              "4. " + book[43] + "\n" +
              "5. " + book[44],
              "Library", JOptionPane.PLAIN_MESSAGE));
            } while (bb[i] > 5);

            an[i] = author[8];

            switch (bb[i]) {
              case 1:
                bn[i] = book[40];
                break;
              case 2:
                bn[i] = book[41];
                break;
              case 3:
                bn[i] = book[42];
                break;
              case 4:
                bn[i] = book[43];
                break;
              case 5:
                bn[i] = book[44];
                break;
            }

            break;

          case 10:
            do {
              bb[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
              author[9] + ":\n\nChoose a book:\n" +
              "1. " + book[45] + "\n" +
              "2. " + book[46] + "\n" +
              "3. " + book[47] + "\n" +
              "4. " + book[48] + "\n" +
              "5. " + book[49],
              "Library", JOptionPane.PLAIN_MESSAGE));
            } while (bb[i] > 5);

            an[i] = author[9];

            switch (bb[i]) {
              case 1:
                bn[i] = book[45];
                break;
              case 2:
                bn[i] = book[46];
                break;
              case 3:
                bn[i] = book[47];
                break;
              case 4:
                bn[i] = book[48];
                break;
              case 5:
                bn[i] = book[49];
                break;
            }

            break;

          default:
            JOptionPane.showMessageDialog(null, "Invalid author", "Library", JOptionPane.ERROR_MESSAGE);
        }

        if (i == 2) {
          break;
        }

        int q = JOptionPane.showConfirmDialog(null, "Hey " + name + ", do you want to borrow another book?", "Library", JOptionPane.YES_NO_OPTION);

        if (q == JOptionPane.NO_OPTION) {
          break;
        }

        qc++;

    }

    //Receipt
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime today = LocalDateTime.now();
    String date = dtf.format(today);

    switch(qc) {

      case 1:
        JOptionPane.showMessageDialog(null,
        date +
        "\nName: " + name +
        "\nSection" + section + "\n\n" +
        "Book borrowed:\n" +
        "1. " + bn[0] + " by " + an[0] + "\n\n" +
        "Thanks for borrowing! Please return the book after 1 week.",
        "Library", JOptionPane.PLAIN_MESSAGE);
        main(args);
        break;

      case 2:
        JOptionPane.showMessageDialog(null,
        date +
        "\nName: " + name +
        "\nSection" + section + "\n\n" +
        "Books borrowed:\n" +
        "1. " + bn[0] + " by " + an[0] + "\n" +
        "2. " + bn[1] + " by " + an[1] + "\n\n" +
        "Thanks for borrowing! Please return the books after 1 week.",
        "Library", JOptionPane.PLAIN_MESSAGE);
        main(args);
        break;

      case 3:
        JOptionPane.showMessageDialog(null,
        date +
        "\nName: " + name +
        "\nSection" + section + "\n\n" +
        "Books borrowed:\n" +
        "1. " + bn[0] + " by " + an[0] + "\n" +
        "2. " + bn[1] + " by " + an[1] + "\n" +
        "3. " + bn[2] + " by " + an[2] + "\n\n" +
        "Thanks for borrowing! Please return the books after 1 week.",
        "Library", JOptionPane.PLAIN_MESSAGE);
        main(args);
        break;

      default:
        JOptionPane.showMessageDialog(null, "Cannot generate receipt. Please try again.", "Library", JOptionPane.ERROR_MESSAGE);
        break;
    }
    } catch (NullPointerException e) {
      JOptionPane.showMessageDialog(null, "Thank you! Come again.", "Library", JOptionPane.PLAIN_MESSAGE);
    } catch (NumberFormatException nfe) {
      JOptionPane.showMessageDialog(null, "Please enter a number.", "Library", JOptionPane.WARNING_MESSAGE);
      main(args);
    }

  }
}
