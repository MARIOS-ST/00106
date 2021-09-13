

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tools {
    static File file ;
    static File file1;
    static Scanner scanner;
    static ArrayList<Integer> studentsIds ; // apothikevonte ta id`s twn foititwn,afou katametrithikan
    static ArrayList<String> Subscriptions; // apothikevonte san ena ENIAIO String ana seira , oi eggrafes
    static ArrayList<Student> students;     // apothikevonte gia kathe foititi oi eggrafes tou , san ena String []
    static ArrayList<Exam> exams;
    static List<String> examsUnique; // apothikevonte ta mathimata memonomena.
    static ArrayList<Period> periods;
    private static String subsNum;
    private static String studentsNum;
    private static String periodsNum;
    private static String examsNum;
    private static Set<String> examSet;
    private static int sols;
    private static int [][]conflictMatrix = new int[271][272];
    

        // H fillId sarwnei to arxeio keimenoy kai briskei to plithos twn foititwn
     public static void findPlithosFoititwn(String path) throws FileNotFoundException
    {
        file = new File(path);
        studentsIds = new ArrayList<Integer>();
        int i = 0;
        scanner = new Scanner(file);
        while(scanner.hasNextLine())
        {
           studentsIds.add(i);
           i++;
           scanner.nextLine();
        }
        scanner.close();
    }
    /* H fillSubs apothikevei tis eggrafes twn foititwn me tin morfi enos eniaiou String gia na
     mporesoume na epeksergastoume ta stoixeia stin sinexeia*/
    public static void fillSubs() throws FileNotFoundException
    {
        Subscriptions = new ArrayList<String>();
        int i = 0;
        scanner = new Scanner(file);
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            Subscriptions.add(line);

        }
        scanner.close();
    }
    // H calcStudentSubs vriskei to plithos twn eggrafwn.
    private static int calcStudentSubs()
    {
        int wordCount = 0;
        for(int i = 0 ; i < Subscriptions.size(); i++)
        {
           StringTokenizer st = new StringTokenizer(Subscriptions.get(i));
           wordCount = wordCount + st.countTokens();
        }
        return wordCount;
    }
    // H findPlithosExetasewn vriskei to plithos twn eksetasewn.
     public static void findPlithosExetasewn()
    {
      ArrayList<String> Courses = new ArrayList<String>();


        for(int i = 0 ; i < Subscriptions.size(); i++)
        {
          int j = 0;
          String[] splits = Subscriptions.get(i).split("\\s");
          while(j < splits.length)
          {
          Courses.add(splits[j]);
          j++;
          }
        }

        examSet = new HashSet<String>(Courses);
        examsNum = String.valueOf(examSet.size());
        subsNum = String.valueOf(calcStudentSubs());
        //apothikevei ta mathimata san memonomenes ontotites, stin lista examsUnique
        examsUnique = Courses.stream().distinct().collect(Collectors.toList());

    }
    /* H findStudentCourses apothikevei gia kathe foititi enan pinaka tipoy String (String[])
       poy periexei tis eggrafes tou gia kathe mathima.*/
    public static void findStudentCourses()
 
    {
        students = new ArrayList<Student>();
        for(int i = 0 ; i < studentsIds.size(); i++)
        {
            students.add(new Student());
            students.get(i).setId(i);
            String[] splitStr = Subscriptions.get(i).trim().split("\\s+");
            students.get(i).courses = splitStr;

        }


    }
    // Η fillExams apothikevei se enan pinaka tis eksetaseis,kathe eksetash exei sigkekrimenous foitites.
    public static void fillExams()
    {
        exams = new ArrayList<Exam>();
        for(int i = 0; i < examsUnique.size(); i++)
        {    exams.add(new Exam());
            for(int j = 0; j < students.size(); j++)
            {
                if(students.get(j).isInCourses(examsUnique.get(i)))
                 {
                    exams.get(i).students.add(students.get(j));
                    exams.get(i).setName(examsUnique.get(i));
                 }
            }
        }       
    }
    /* H calcDensity sygkrinei eksetaseis pou vriskonte stin idia periodo, kai an kapoios foititis eksetazete se 2 mathimata toulaxiston
     ta opoia vriskonte stin idia periodo , tote uparxei sigkroush*/
    public static void CalcDensity()
    {  
        // Η parakatw methodologia diaxorizei tis eksetaseis se 32 periodous.
        int from = 0;
        int to = (exams.size()/32);
        int i = 0;   
        periods = new ArrayList<Period>();//αρχικοποιηση πινακα περιοδων
        
           while(i <= 31){
               if(i >= 0 && i <= 30) {
                periods.add(new Period());
                List<Exam> ex = new ArrayList<Exam>();
                ex = exams.subList(from, to);
                
                for(int k = 0; k < ex.size(); k++){
                periods.get(i).exams.add(ex.get(k));
                }
                periods.get(i).setId(i);
                from = to + 1;
                to = to + 16;
                i++;
               }
               else{
                List<Exam> ex = new ArrayList<Exam>();
                ex = exams.subList(from, to);
                for(int k = 0; k < ex.size(); k++){
                periods.get(i).exams.add(ex.get(k));
                }
                periods.get(i).setId(i);
                  i++;
                }           
           }
           
          /* Φτιαχνουμε τον πινακα συγκρουσεων
           για εξετασεις που βρισκονται στην ιδια περιοδο.
           */
         for(int j = 0; j < periods.size(); j++)
          {
               int y = 0;
             for(int x = 0; x < periods.get(j).exams.size(); x++)
            {
               while(y < periods.get(j).exams.get(x).students.size() && j+1 <= exams.size())
               {
                  if(isInCoflict(periods.get(j).exams.get(x).getStudent(y),periods.get(j).exams.get(j+1)))
                 {
                   conflictMatrix[j][j+1] = 1;
                 }
                  else
                 {
                   conflictMatrix[j][j+1] = 0;
                 }
                  y++;
               }
            }
          }
         

    }
    /*
        H methodos isInCoflict dexete parametrika enan spoudasti kai mia exetasi
        kai elenxi an o spoudastis vriskete stin sigkekrimeni eksetasi.
    */
      public static boolean isInCoflict(Student s1 , Exam e2)
    {   
        for(int i = 0; i < e2.students.size(); i++)
        {
            if(e2.students.get(i).getId() == (s1.getId()));
            return true;
        }
       return false;
        
    }
    
    // H fillSolutions fortonei tis liseis apo to arxeio keimenoy sto programma.
    public static void fillSolutions(String path) throws FileNotFoundException
    {
        int counter = 0;
        file1 = new File(path);
        int i = 0;
        scanner = new Scanner(file1);
        while(scanner.hasNextLine())
        {
           counter = counter + 1;
           i++;
           scanner.nextLine();
        }
        scanner.close();
        sols = counter;
    }
    //Parakatw einai oi getters gia tin enalagi dedomenwn metaksi twn klasewn
    public static String getSolsNum()
    {
        return String.valueOf(sols);
    }

    public static String getSubs()
    {
        subsNum = String.valueOf(calcStudentSubs());
        return subsNum;
    }
    public static String getStudents()
    {
        studentsNum = String.valueOf(studentsIds.size());
        return studentsNum;
    }
//    public static String getPeriods()
//    {   Periods = "32";
//        return Periods;
//    }
    public static String getExams()
    {
        examsNum = String.valueOf(examSet.size());
        return examsNum;
    }

}
