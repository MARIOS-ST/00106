

import java.io.FileNotFoundException;



public interface Analyzer {
    public void createAnalyzer(AnalyzeFrame af);
}
/* 
 H klassi Problem antiprosopevei to provlima kai ylopoiei to interface Analyzer
 H diepafi analyzer periexei tin methodo h opoia ftiaxnei ksexorista kainourio jFrame
 gia to kathe provlima.

*/
class Problem implements Analyzer
{   String path;
    String probnum;
    String periods;
    String density;
    String solpath;
    AnalyzeFrame af;
    SolutionsFrame solframe;
    
    Problem(String path , String probnum , String periods , String density , String solpath)
    {
        this.path = path;
        this.probnum = probnum;
        this.periods = periods;
        this.density = density;
        this.solpath = solpath;
    }
   
    public void createAnalyzer(AnalyzeFrame af)
    {
        this.af = af;
        if(probnum.equals("1"))
        {
        af.LProblemName.setText("CAR-F-92");
        }
        else if(probnum.equals("2"))
        {
         af.LProblemName.setText("CAR-S-91");
        }
        else if(probnum.equals("3"))
        {
         af.LProblemName.setText("EAR-F-83");
        }
        else if(probnum.equals("4"))
        {
         af.LProblemName.setText("HEC-S-92");
        }
        else if(probnum.equals("5"))
        {
         af.LProblemName.setText("KFU-S-93");
        }
        else if(probnum.equals("6"))
        {
         af.LProblemName.setText("LSE-F-91");
        }
        else if(probnum.equals("7"))
        {
         af.LProblemName.setText("PUR-S-93");
        }
        else if(probnum.equals("8"))
        {
         af.LProblemName.setText("RYE-S-93");
        }
        else if(probnum.equals("9"))
        {
         af.LProblemName.setText("STA-F-83");
        }
        else if(probnum.equals("10"))
        {
         af.LProblemName.setText("TRE-S-92");
        }
        else if(probnum.equals("11"))
        {
         af.LProblemName.setText("UTA-S-92");
        }
        else if(probnum.equals("12"))
        {
         af.LProblemName.setText("UTE-S-92");
        }
         else if(probnum.equals("13"))
        {
         af.LProblemName.setText("YOR-F-83");
        }
        af.setLocationRelativeTo(null);
        af.setVisible(true);
        af.AnalyzeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnalyzeButtonMouseClicked(evt);
            }
        });
        af.Backbutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackbuttMouseClicked(evt);
            }
        });
        af.Solbutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SolbuttMouseClicked(evt);
            }
        });
        
    }
     private void AnalyzeButtonMouseClicked(java.awt.event.MouseEvent evt) 
     {                                           
           try 
           {
           Tools.findPlithosFoititwn(path);
           Tools.fillSubs();
           Tools.findPlithosExetasewn();
           } 
           catch (FileNotFoundException ex) 
           {
            
           }
           af.StudsValue.setText(Tools.getStudents());
           af.StudsValue.setVisible(true);
           af.SubsValue.setText(Tools.getSubs());
           af.SubsValue.setVisible(true);
           af.PeriodsValue.setText(periods);
           af.PeriodsValue.setVisible(true);
           af.ExamsValue.setText(Tools.getExams());
           af.ExamsValue.setVisible(true);
           af.ConflictValue.setText(density);
           af.ConflictValue.setVisible(true);
           af.AnalyzeButton.setVisible(false);
           af.Backbutt.setVisible(true);
           af.Solbutt.setVisible(true);
           
    }
     private void BackbuttMouseClicked(java.awt.event.MouseEvent evt)
     {                                      
        af.dispose();
        HomeFrame frame = new HomeFrame();
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
     } 
      private void SolbuttMouseClicked(java.awt.event.MouseEvent evt) 
      {                                     
          try
          {
            Tools.fillSolutions(solpath);
          }
          catch(FileNotFoundException ex)
          {
              
          }
          af.dispose();
          solframe = new SolutionsFrame();
           if(probnum.equals("1"))
           {
             solframe.solutionsHead.setText("CAR-F-92 SOLUTIONS");
             solframe.cost.setText("3.71");
             solframe.solutionsNum.setText(Tools.getSolsNum());
           }
           else if(probnum.equals("2"))
           {
             solframe.solutionsHead.setText("CAR-S-91 SOLUTIONS");
             solframe.cost.setText("4.39");
             solframe.solutionsNum.setText(Tools.getSolsNum());
             
           }
           else if(probnum.equals("3"))
           {
             solframe.solutionsHead.setText("EAR-F-83 SOLUTIONS");
             af.LProblemName.setText("EAR-F-83");
             solframe.solutionsNum.setText(Tools.getSolsNum());
             solframe.cost.setText("32.63");
           }
            else if(probnum.equals("4"))
           {
             solframe.solutionsHead.setText("HEC-S-92 SOLUTIONS");
             af.LProblemName.setText("HEC-S-92");
             solframe.solutionsNum.setText(Tools.getSolsNum());
             solframe.cost.setText("10.04");
           }
            else if(probnum.equals("5"))
           {
             solframe.solutionsHead.setText("KFU-S-93 SOLUTIONS");
             af.LProblemName.setText("KFU-S-93");
             solframe.solutionsNum.setText(Tools.getSolsNum());
             solframe.cost.setText("12.90");
           }
            else if(probnum.equals("6"))
           {
             solframe.solutionsHead.setText("LSE-F-91 SOLUTIONS");
             af.LProblemName.setText("LSE-F-91");
             solframe.solutionsNum.setText(Tools.getSolsNum());
             solframe.cost.setText("9.82");
           }
            else if(probnum.equals("7"))
           {
             solframe.solutionsHead.setText("PUR-S-93 SOLUTIONS");
             af.LProblemName.setText("PUR-S-93");
             solframe.solutionsNum.setText(Tools.getSolsNum());
             solframe.cost.setText("4.49");
           }
            else if(probnum.equals("8"))
           {
             solframe.solutionsHead.setText("RYE-S-93 SOLUTIONS");
             af.LProblemName.setText("RYE-S-93");
             solframe.solutionsNum.setText(Tools.getSolsNum());
             solframe.cost.setText("7.93");
           }
            else if(probnum.equals("9"))
           {
             solframe.solutionsHead.setText("STA-F-83 SOLUTIONS");
             af.LProblemName.setText("STA-F-83");
             solframe.solutionsNum.setText(Tools.getSolsNum());
             solframe.cost.setText("157.03");
           }
            else if(probnum.equals("10"))
           {
             solframe.solutionsHead.setText("TRE-S-92 SOLUTIONS");
             af.LProblemName.setText("TRE-S-92");
             solframe.solutionsNum.setText(Tools.getSolsNum());
             solframe.cost.setText("7.72");
           } 
            else if(probnum.equals("11"))
           {
             solframe.solutionsHead.setText("UTA-S-92 SOLUTIONS");
             af.LProblemName.setText("UTA-S-92");
             solframe.solutionsNum.setText(Tools.getSolsNum());
             solframe.cost.setText("3.04");
           }
            else if(probnum.equals("12"))
           {
             solframe.solutionsHead.setText("UTE-S-92 SOLUTIONS");
             af.LProblemName.setText("UTE-S-92");
             solframe.solutionsNum.setText(Tools.getSolsNum());
             solframe.cost.setText("24.77");
           }
            else if(probnum.equals("13"))
           {
             solframe.solutionsHead.setText("YOR-F-83 SOLUTIONS");
             af.LProblemName.setText("YOR-F-83");
             solframe.solutionsNum.setText(Tools.getSolsNum());
             solframe.cost.setText("34.71");
           }
           
          
          solframe.setVisible(true);
          solframe.setSize(400,400);
          solframe.setLocationRelativeTo(null);
          solframe.backtomenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backtomenuMouseClicked(evt);
            }
        });
      } 
      private void backtomenuMouseClicked(java.awt.event.MouseEvent evt) { 
        solframe.dispose();  
        HomeFrame frame = new HomeFrame();
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        
    }   
     
    
}



