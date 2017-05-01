package textExcel;

public class Tester
{
    public static void main(String[] args)
    {
        //testCheckpoint1();
        //testCheckpoint1Advanced();
        //testCheckpoint2();
        //testCheckpoint2Advanced();
        //testCheckpoint3();
        //testCheckpoint3Advanced();
        //testCheckpoint4();
        //testCheckpoint4Advanced();
        //testCheckpoint5();
        //testCheckpoint5Advanced();
        //testCheckpoint6();
        testCheckpoint6Advanced();
    }

    private static void testCheckpoint1()
    {
        Spreadsheet sheet = new Spreadsheet();

        System.out.println(sheet.processCommand("print"));
    }

    private static void testCheckpoint1Advanced()
    {
        Spreadsheet sheet = new Spreadsheet();

        System.out.println(sheet.processCommand(""));
    }

    private static void testCheckpoint2()
    {
        Spreadsheet sheet = new Spreadsheet();

        System.out.println(sheet.processCommand("B2 = 6"));
        System.out.println(sheet.processCommand("B3 = -5.283"));
        System.out.println(sheet.processCommand("B4 = 1/27/1996"));
        System.out.println(sheet
                .processCommand("C2 = \"This is a long string\""));
        System.out.println(sheet.processCommand("C3 = \"quot\"es\""));
        System.out.println(sheet.processCommand("C4 = 999.123456789"));
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("B2") + " (B2 = 6)");
        System.out.println(sheet.processCommand("B4") + " (B4 =  1/27/1996)");
        System.out.println(sheet.processCommand("C2")
                + " (C2 = \"This is a long string\")");
        System.out.println(sheet.processCommand("C3") + " (C3 = \"quot\"es\")");
        System.out
                .println(sheet.processCommand("C4") + " (C4 = 999.123456789)");
        System.out.println(sheet.processCommand("A1") + " (A1 = <empty>)");
    }

    private static void testCheckpoint2Advanced()
    {
        Spreadsheet sheet = new Spreadsheet();

        System.out.println(sheet.processCommand("A1 = \"first\""));
        System.out.println(sheet.processCommand("A1") + " (A1 = \"first\")");
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("G10 = \"Hello, World!\""));
        System.out.println(sheet.processCommand("G10")
                + " (G10 = \"Hello, World!\")");
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("B2 = \"\""));
        System.out.println(sheet.processCommand("B2") + " (B2 = \"\")");
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("A1 = 11/25/1964"));
        System.out.println(sheet.processCommand("A1") + " (A1 = 11/25/1964)");
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("D9 = 3.14"));
        System.out.println(sheet.processCommand("D9") + " (D9 = 3.14)");
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("A1 = 0.0"));
        System.out.println(sheet.processCommand("A1") + " (A1 = 0)");
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("B1 = -2.0"));
        System.out.println(sheet.processCommand("B1") + " (B1 = -2)");
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("A1 = 3.00"));
        System.out.println(sheet.processCommand("A1") + " (A1 = 3)");
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("B1 = -74.05000"));
        System.out.println(sheet.processCommand("B1") + " (B1 = -74.05)");
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("C1 = 400.0"));
        System.out.println(sheet.processCommand("C1") + " (C1 = 400)");
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("A1 = -9876543212345"));
        System.out.println(sheet.processCommand("A1")
                + " (A1 = -9876543212345)");
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("A2 = 3.14159265358979"));
        System.out.println(sheet.processCommand("A2")
                + " (A2 = 3.14159265358979)");
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("A3 = 123456.0"));
        System.out.println(sheet.processCommand("A3") + " (A3 = 123456)");
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("A1")
                + " (A1 = -9876543212345)");
        System.out.println(sheet.processCommand("A1 = \"first\""));
        System.out.println(sheet.processCommand("A1") + " (A1 = \"first\")");

        System.out.println(sheet.processCommand("B7 = \"A1 = ( avg A2-A3 )\""));
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet
                .processCommand("F7 = \"A1 = ( 1 * 2 / 1 + 3 - 5 )\""));
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("B7")
                + " (B7 = \"A1 = ( avg A2-A3 )\")");
        System.out.println(sheet.processCommand("F7")
                + " (F7 = \"A1 = ( 1 * 2 / 1 + 3 - 5 )\")");

        System.out.println(sheet.processCommand("G2 = \"ThisIsALongString\""));
        System.out.println(sheet.processCommand("G2")
                + " (G2 = \"ThisIsALongString\")");
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("b5 = \"Cell\""));
        System.out.println(sheet.processCommand("b5") + " (B5 = \"Cell\")");
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("b2 = \"\""));
        System.out.println(sheet.processCommand("B2") + " (B2 = \"\")");
        System.out.println(sheet.processCommand("c9 = 3.1410"));
        System.out.println(sheet.processCommand("c9") + " (C9 = 3.141)");
    }

    private static void testCheckpoint3()
    {
        Spreadsheet sheet = new Spreadsheet();

        System.out.println(sheet.processCommand("A1 = 77"));
        System.out.println(sheet
                .processCommand("B1 = \"hey there, how's it going?\""));
        System.out.println(sheet.processCommand("A2 = 8/23/99"));
        System.out.println(sheet.processCommand("B2 = -3"));
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("clear A1"));
        System.out.println(sheet.processCommand("A1") + " (A1 = <empty>)");
        System.out.println(sheet.processCommand("print"));

        System.out
                .println(sheet.processCommand("save Before Clearing All.txt"));
        System.out.println(sheet.processCommand("clear"));
        System.out.println(sheet.processCommand("print"));

        System.out
                .println(sheet.processCommand("load Before Clearing All.txt"));
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("B1")
                + " (B1 = \"hey there, how's it going?\")");
        System.out.println(sheet.processCommand("A2") + " (A2 = 8/23/0099)");
        System.out.println(sheet
                .processCommand("load Some File That Doesn't Exist.txt"));
        System.out.println(sheet.processCommand("print"));
    }

    private static void testCheckpoint3Advanced()
    {
        Spreadsheet sheet = new Spreadsheet();

        System.out.println(sheet.processCommand("A1 = \"first\""));
        System.out.println(sheet.processCommand("D8 = \"second\""));
        System.out.println(sheet.processCommand("clear"));
        System.out.println(sheet.processCommand("A1") + " (A1 = <empty>)");
        System.out.println(sheet.processCommand("D8") + " (D8 = <empty>)");

        System.out.println(sheet.processCommand("A1 = \"first\""));
        System.out.println(sheet.processCommand("D8 = \"second\""));
        System.out.println(sheet.processCommand("clear A1"));
        System.out.println(sheet.processCommand("A1") + " (A1 = <empty>)");
        System.out.println(sheet.processCommand("D8") + " (D8 = \"second\")");

        System.out.println(sheet.processCommand("A1 = 01/02/1822"));
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("B2 = -5.0"));
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("C3 = 2.718"));
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("D4 = 0.0"));
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("A1 = \"oNe\""));
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("G10 = \"TWo\""));
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("clear A1"));
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("clear"));
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("A1 = \"first\""));
        System.out.println(sheet.processCommand("D8 = \"second\""));
        System.out.println(sheet.processCommand("CleaR"));
        System.out.println(sheet.processCommand("A1") + " (A1 = <empty>)");
        System.out.println(sheet.processCommand("D8") + " (D8 = <empty>)");

        System.out.println(sheet.processCommand("A1 = \"first\""));
        System.out.println(sheet.processCommand("D8 = \"second\""));
        System.out.println(sheet.processCommand(" clear ".trim()));
        System.out.println(sheet.processCommand("A1") + " (A1 = <empty>)");
        System.out.println(sheet.processCommand("D8") + " (D8 = <empty>)");
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("clear"));
        System.out.println(sheet.processCommand("A9 = \"first\""));
        System.out.println(sheet.processCommand("D8 = \"second\""));
        System.out.println(sheet.processCommand("clEAr a9"));
        System.out.println(sheet.processCommand("A9") + " (A9 = <empty>)");
        System.out.println(sheet.processCommand("D8") + " (D8 = \"second\")");

        System.out.println(sheet.processCommand("save"));
        System.out.println(sheet.processCommand("load"));
    }

    private static void testCheckpoint4()
    {
        Spreadsheet sheet = new Spreadsheet();

        System.out.println(sheet.processCommand("A1 = ( 2 + 3 )"));
        System.out.println(sheet.processCommand("B1 = ( 5 / 2 )"));
        System.out.println(sheet.processCommand("C1 = ( -3 - 2 * 5 / 2 )"));
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("B1") + " (B1 = ( 5 / 2 ))");
        System.out.println(sheet.processCommand("C1")
                + " (C1 = ( -3 - 2 * 5 / 2 ))");
    }

    private static void testCheckpoint4Advanced()
    {
        Spreadsheet sheet = new Spreadsheet();

        System.out.println(sheet
                .processCommand("E5 = ( 4 * 5.5 / 2 + 1 - -11.5 )"));
        System.out.println(sheet.processCommand("E5")
                + " (E5 = ( 4 * 5.5 / 2 + 1 - -11.5 ))");
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("clear"));

        System.out.println(sheet.processCommand("A1 = ( -43.5 )"));
        System.out.println(sheet.processCommand("A1") + " (A1 = ( -43.5 ))");
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet
                .processCommand("A1 = ( 2 * 3 * 4 * 5 / 2 / 3 / 2 )"));
        System.out.println(sheet.processCommand("A1")
                + " (A1 = ( 2 * 3 * 4 * 5 / 2 / 3 / 2 ))");
        System.out.println(sheet.processCommand("print")); // A1 = 10.0

        System.out.println(sheet
                .processCommand("G10 = ( 1 + 3 + 5 - 2 - 4 - 6 )"));
        System.out.println(sheet.processCommand("G10")
                + " (G10 = ( 1 + 3 + 5 - 2 - 4 - 6 ))");
        System.out.println(sheet.processCommand("print")); // G10 = -3.0

        System.out.println(sheet
                .processCommand("E1 = ( 5.4 * 3.5 / -1.4 + 27.4 - 11.182 )"));
        System.out.println(sheet.processCommand("E1")
                + " (E1 = ( 5.4 * 3.5 / -1.4 + 27.4 - 11.182 ))");
        System.out.println(sheet.processCommand("print")); // E1 = ~2.718

        System.out.println(sheet
                .processCommand("A1 = ( -2 * -3.0 * 4 * 5 / -2 / 3 / 2 )"));
        System.out.println(sheet.processCommand("A1")
                + " (A1 = ( -2 * -3.0 * 4 * 5 / -2 / 3 / 2 ))");
        System.out.println(sheet.processCommand("print")); // A1 = -10.0

        System.out.println(sheet
                .processCommand("G10 = ( -1 + 3 + 5.0 - -2 - 4 - 6 + -2 )"));
        System.out.println(sheet.processCommand("G10")
                + " (G10 = ( -1 + 3 + 5.0 - -2 - 4 - 6 + -2 ))");
        System.out.println(sheet.processCommand("print")); // G10 = -3.0

        System.out.println(sheet.processCommand("A10 = ( 1 + 2 * 3 + 4 )"));
        System.out.println(sheet.processCommand("A10")
                + " (A10 = ( 1 + 2 * 3 + 4 ))");
        System.out.println(sheet.processCommand("print")); // A10 = 13.0 or 11.0

        System.out.println(sheet
                .processCommand("E1 = ( 1 + 2 * 3 + 4.5 - 5 * 6 - 3.0 / 2 )"));
        System.out.println(sheet.processCommand("E1")
                + " (E1 = ( 1 + 2 * 3 + 4.5 - 5 * 6 - 3.0 / 2 ))");
        System.out.println(sheet.processCommand("print")); // E1 = 24.0 or 20.0
    }

    private static void testCheckpoint5()
    {
        Spreadsheet sheet = new Spreadsheet();

        System.out.println(sheet.processCommand("A1 = 1"));
        System.out.println(sheet.processCommand("B1 = 2"));
        System.out.println(sheet.processCommand("C1 = 3"));

        System.out.println(sheet.processCommand("A2 = 4"));
        System.out.println(sheet.processCommand("B2 = 5"));
        System.out.println(sheet.processCommand("C2 = 6"));

        System.out.println(sheet.processCommand("A4 = ( A1 )"));
        System.out.println(sheet.processCommand("B4 = ( A1 + C1 / 3 )"));
        System.out.println(sheet.processCommand("C4 = ( A4 - B4 * -1 )"));

        System.out.println(sheet.processCommand("A5 = ( sum A1 - C2 )"));
        System.out.println(sheet.processCommand("B5 = ( avg A1 - C2 )"));
        System.out.println(sheet.processCommand("C5 = ( sum A1 - C1 )"));

        System.out.println(sheet.processCommand("print"));
    }

    private static void testCheckpoint5Advanced()
    {
        Spreadsheet sheet = new Spreadsheet();

        System.out.println(sheet.processCommand("A7 = 37.05"));
        System.out.println(sheet.processCommand("A8 = ( SuM A7 - A7 )"));
        System.out.println(sheet.processCommand("print")); // A8 = 37.05

        System.out.println(sheet.processCommand("A1 = -9"));
        System.out.println(sheet.processCommand("A2 = ( 3 * A1 )"));
        System.out.println(sheet.processCommand("B1 = ( avg A2 - A2 )"));
        System.out.println(sheet.processCommand("print")); // B1 = -27.0

        System.out.println(sheet.processCommand("C3 = 1"));
        System.out.println(sheet.processCommand("C4 = ( C3 * 2 )"));
        System.out.println(sheet.processCommand("C5 = ( C4 - C3 )"));
        System.out.println(sheet.processCommand("C6 = ( 32 - C4 )"));
        System.out.println(sheet.processCommand("F10 = ( SUM c3 - c6 )"));
        System.out.println(sheet.processCommand("G10 = ( avg c3 - c6 )"));
        System.out.println(sheet.processCommand("print")); // F10 = 34.0, G10 =
                                                           // 8.5

        System.out.println(sheet.processCommand("B8 = 3"));
        System.out.println(sheet.processCommand("C8 = ( 5 )"));
        System.out.println(sheet.processCommand("D8 = ( -1 * B8 + C8 )"));
        System.out.println(sheet.processCommand("E8 = ( sum B8 - D8 )"));
        System.out.println(sheet.processCommand("F8 = ( AVG B8 - E8 )"));
        System.out.println(sheet.processCommand("print")); // E8 = 10.0, F8 =
                                                           // 5.0

        System.out.println(sheet.processCommand("clear"));
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 5; j++)
            {
                String cellId = "" + (char) ('A' + j) + (i + 1);
                sheet.processCommand(cellId + " = " + (i * j));
            }
        System.out.println(sheet.processCommand("G8 = ( sum A1 - E4 )"));
        System.out.println(sheet.processCommand("G9 = ( avg A1 - E4 )"));
        System.out.println(sheet.processCommand("print")); // G8 = 60.0, G9 =
                                                           // 3.0

        String formula = "( A1 * A2 / A3 + A4 - A5 )";
        System.out.println(sheet.processCommand("A1 = 5.4"));
        System.out.println(sheet.processCommand("A2 = 3.5"));
        System.out.println(sheet.processCommand("A3 = -1.4"));
        System.out.println(sheet.processCommand("A4 = 27.4"));
        System.out.println(sheet.processCommand("A5 = 11.182"));
        System.out.println(sheet.processCommand("F9 = " + formula));
        System.out.println(sheet.processCommand("F9")
                + " (F9 = ( A1 * A2 / A3 + A4 - A5 ))");
        System.out.println(sheet.processCommand("print")); // F9 = 2.717999999>
        System.out.println(sheet.processCommand("A4 = 25.4"));
        System.out.println(sheet.processCommand("print")); // F9 = 0.717999999>
        System.out.println(sheet.processCommand("F9")
                + " (F9 = ( A1 * A2 / A3 + A4 - A5 ))");

        System.out.println(sheet.processCommand("A1 = 5.4"));
        System.out.println(sheet.processCommand("A2 = 3.5"));
        System.out.println(sheet.processCommand("A3 = -1.4"));
        System.out.println(sheet.processCommand("A4 = 27.4"));
        System.out.println(sheet.processCommand("A5 = 11.182"));
        System.out.println(sheet.processCommand("F9 = " + formula));
        System.out.println(sheet.processCommand("F9")
                + " (F9 = ( A1 * A2 / A3 + A4 - A5 ))");
        System.out.println(sheet.processCommand("print")); // F9 = 2.717999999>
        System.out.println(sheet.processCommand("A4 = 25.4"));
        System.out.println(sheet.processCommand("print")); // F9 = 0.717999999>
        System.out.println(sheet.processCommand("F9")
                + " (F9 = ( A1 * A2 / A3 + A4 - A5 ))");

        System.out.println(sheet.processCommand("F1 = 1"));
        System.out.println(sheet.processCommand("F2 = ( 1 )"));
        System.out.println(sheet.processCommand("F3 = ( F2 + F1 )"));
        System.out.println(sheet.processCommand("F4 = ( F2 + F3 )"));
        System.out.println(sheet.processCommand("F5 = ( F3 + F4 )"));
        System.out.println(sheet.processCommand("print")); // F5 = 5.0
        System.out.println(sheet.processCommand("F5") + " (F5 = ( F3 + F4 ))");

        System.out.println(sheet.processCommand("clear"));
        System.out.println(sheet.processCommand("F1 = 1.0"));
        System.out.println(sheet.processCommand("F2 = ( 1.0 )"));
        System.out.println(sheet.processCommand("F3 = ( F2 + F1 )"));
        System.out.println(sheet.processCommand("F4 = ( F2 + F3 )"));
        System.out.println(sheet.processCommand("F5 = ( F3 + F4 )"));
        System.out.println(sheet.processCommand("print")); // F1 = 1.0, F2 =
                                                           // 1.0, F3 = 2.0, F4
                                                           // = 3.0, F5 = 5.0
        System.out.println(sheet.processCommand("F4") + " (F4 = ( F2 + F3 ))");
        System.out.println(sheet.processCommand("F3 = 11.5"));
        System.out.println(sheet.processCommand("print")); // F3 = 11.5, F4 =
                                                           // 12.5, F5 = 24.0
        System.out.println(sheet.processCommand("F4") + " (F4 = ( F2 + F3 ))");

        System.out.println(sheet.processCommand("clear"));
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 5; j++)
            {
                String cellId = "" + (char) ('A' + j) + (i + 1);
                sheet.processCommand(cellId + " = " + (i * j));
            }
        System.out.println(sheet.processCommand("G8 = ( sum A1 - E4 )"));
        System.out.println(sheet.processCommand("print")); // G8 = 60.0
        System.out.println(sheet.processCommand("G9 = ( avg A1 - E4 )")); // G9
                                                                          // =
                                                                          // 3.0
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("E4 = ( sum A4 - D4 )")); // E4
                                                                          // =
                                                                          // 18.0,
                                                                          // G8
                                                                          // =
                                                                          // 66.0,
                                                                          // G9
                                                                          // =
                                                                          // 3.3
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("A7 = -37.05"));
        System.out.println(sheet.processCommand("A8 = ( SuM A7 - A7 )"));
        System.out.println(sheet.processCommand("print")); // A8 = -37.05

        System.out.println(sheet.processCommand("clear"));
        System.out.println(sheet.processCommand("A1 = -9"));
        System.out.println(sheet
                .processCommand("A2 = ( 14 - 7 + -4 - 3 + 3 * A1 )"));
        System.out.println(sheet.processCommand("b1 = ( avG A2 - a2 )"));
        System.out.println(sheet.processCommand("print")); // B1 = -27.0

        System.out.println(sheet.processCommand("C5 = 1.0"));
        System.out.println(sheet
                .processCommand("C6 = ( 7 + 2 - 3 + -6 + C5 * 2 )")); // 2
        System.out.println(sheet.processCommand("C7 = ( C6 - C5 )")); // 1
        System.out.println(sheet.processCommand("C8 = ( 32 - C6 )")); // 30
        System.out.println(sheet.processCommand("F10 = ( SuM c5 - C8 )")); // 34
        System.out.println(sheet.processCommand("G10 = ( Avg c5 - C8 )")); // 8.5
        System.out.println(sheet.processCommand("print")); // F10 = 34.0, G10 =
                                                           // 8.5

        System.out.println(sheet.processCommand("B8 = 3"));
        System.out.println(sheet.processCommand("C8 = ( 5 )"));
        System.out.println(sheet
                .processCommand("D8 = ( 2 * -3 + 4 - -2 + -1 * B8 + C8 )")); // 2
        System.out.println(sheet.processCommand("E8 = ( sum B8 - D8 )")); // 10
        System.out.println(sheet.processCommand("F8 = ( AVG B8 - E8 )")); // 5
        System.out.println(sheet.processCommand("print")); // E8 = 10.0, F8 =
                                                           // 5.0

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 5; j++)
            {
                String cellId = "" + (char) ('A' + j) + (i + 1);
                System.out.println(sheet.processCommand(cellId
                        + " = ( 3 * 2 - 4 + -2 + " + i + " * " + j + " )"));
            }
        System.out.println(sheet.processCommand("G8 = ( sum A1 - E4 )"));
        System.out.println(sheet.processCommand("G9 = ( avg A1 - E4 )"));
        System.out.println(sheet.processCommand("print")); // G8 = 60.0, G9 =
                                                           // 3.0

        System.out.println(sheet.processCommand("A1 = ( 1 + 2 + 3 + 4 )")); // 10,
                                                                            // then
                                                                            // 9
        System.out.println(sheet.processCommand("A2 = ( 1 * 2 * 3 * 4 )")); // 24
        System.out.println(sheet.processCommand("B1 = ( Sum a1 - a2 )")); // 34,
                                                                          // then
                                                                          // 33
        System.out.println(sheet.processCommand("B2 = ( avG a1 - A2 )")); // 17,
                                                                          // then
                                                                          // 16.5
        System.out.println(sheet.processCommand("C1 = ( sum A1 - B2 )")); // 85,
                                                                          // then
                                                                          // 82.5
        System.out.println(sheet.processCommand("C2 = ( avg a1 - b2 )")); // 21.25,
                                                                          // then
                                                                          // 20.625
        System.out.println(sheet.processCommand("d1 = ( c1 / 5.0 )")); // 17,
                                                                       // then
                                                                       // 16.5
        System.out.println(sheet.processCommand("d2 = ( c2 + 1.75 + a1 )")); // 33,
                                                                             // then
                                                                             // 31.375
        System.out.println(sheet.processCommand("e2 = 18"));
        System.out.println(sheet.processCommand("d3 = 29"));
        System.out.println(sheet.processCommand("A10 = ( SUM A1 - D2 )")); // 241.25,
                                                                           // then
                                                                           // 233.5
        System.out.println(sheet.processCommand("B10 = ( AVG A1 - D2 )")); // 30.15625,
                                                                           // then
                                                                           // 29.1875
        System.out.println(sheet.processCommand("A10")); // 241.25, then 233.5
        System.out.println(sheet.processCommand("B10")); // 30.15625, then
                                                         // 29.1875
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("a1 = 9"));
        System.out.println(sheet.processCommand("A10")); // 241.25, then 233.5
        System.out.println(sheet.processCommand("B10")); // 30.15625, then
                                                         // 29.1875
        System.out.println(sheet.processCommand("print"));

        formula = "( 3.0 + A1 * A2 / -1.4 + A4 - A5 * -2.0 )";
        System.out.println(sheet.processCommand("A1 = 5.4"));
        System.out.println(sheet.processCommand("A2 = 3.5"));
        System.out.println(sheet.processCommand("A4 = 27.4"));
        System.out.println(sheet.processCommand("A5 = 11.182"));
        System.out.println(sheet.processCommand("F9 = " + formula));
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("F9"));
        System.out.println(sheet.processCommand("A4 = 25.4"));
        System.out.println(sheet.processCommand("print"));
        System.out.println(sheet.processCommand("F9"));

        System.out.println(sheet.processCommand("F1 = 1"));
        System.out.println(sheet.processCommand("F2 = ( 1 )"));
        System.out.println(sheet
                .processCommand("F3 = ( 1 + 3 + F2 + F1 - 3 - 1 )"));
        System.out
                .println(sheet.processCommand("F4 = ( 1.0 * F2 + F3 - 0.0 )"));
        String outerFormula = "( 1.0 - 1 + F3 + F4 * 1.0 )";
        System.out.println(sheet.processCommand("F5 = " + outerFormula));
        System.out.println(sheet.processCommand("print")); // F5 = 7.0
        System.out.println(sheet.processCommand("F5"));
    }

    private static void testCheckpoint6()
    {
        Spreadsheet sheet = new Spreadsheet();

        System.out.println(sheet.processCommand("B3 = 100"));
        System.out.println(sheet.processCommand("C3 = 2"));
        System.out.println(sheet.processCommand("D3 = 10"));
        System.out.println(sheet.processCommand("E3 = 200"));
        System.out.println(sheet.processCommand("F3 = 2"));
        System.out.println(sheet.processCommand("D6 = 5"));
        System.out.println(sheet.processCommand("D7 = 60"));
        System.out.println(sheet.processCommand("D8 = 500"));
        System.out.println(sheet.processCommand("D9 = 6"));
        System.out.println(sheet.processCommand("D10 = 5"));
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("sorta B3 - F3"));
        System.out.println(sheet.processCommand("sorta D6 - D10"));
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("sortd B3 - F3"));
        System.out.println(sheet.processCommand("sortd D6 - D10"));
        System.out.println(sheet.processCommand("print"));
    }

    private static void testCheckpoint6Advanced()
    {
        Spreadsheet sheet = new Spreadsheet();

        System.out.println(sheet.processCommand("A1 = OPTIONAL"));
        System.out.println(sheet.processCommand("B2 = 7"));
        System.out.println(sheet.processCommand("C2 = 23"));
        System.out.println(sheet.processCommand("D2 = -2.5"));
        System.out.println(sheet.processCommand("B3 = 15"));
        System.out.println(sheet.processCommand("C3 = 0"));
        System.out.println(sheet.processCommand("D3 = 7"));
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("sorta B2 - D3"));
        System.out.println(sheet.processCommand("print"));

        System.out.println(sheet.processCommand("sortd B2 - D3"));
        System.out.println(sheet.processCommand("print"));
    }

}