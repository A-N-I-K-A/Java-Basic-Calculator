
package calculator;
import java.util.Stack;
import java.lang.Math;
import javax.swing.JTextField;

public class Frame extends javax.swing.JFrame {

    //taking an expression that to be calculated
    String exp="";
    
    //a flag to check if any tigonometric function is involved
    int flagForTrigonmetry=0;
    
    //a flag to check if shift is presssed
    int isShift=0;
    
    //flag for invalid syntax 
    int Invalid=0;
    
    
    public Frame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        negate = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        div = new javax.swing.JButton();
        screen = new javax.swing.JTextField();
        ac = new javax.swing.JButton();
        del = new javax.swing.JButton();
        closingParenthesis = new javax.swing.JButton();
        shift = new javax.swing.JButton();
        openingParenthesis = new javax.swing.JButton();
        trigonmetry = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 91, 80));

        btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 87, 80));

        btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 91, 80));

        btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 93, 80));

        btn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 91, 80));

        btn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 87, 80));

        btn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 93, 77));

        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 90, 80));

        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 93, 80));

        negate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        negate.setText("+/-");
        negate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negateActionPerformed(evt);
            }
        });
        jPanel1.add(negate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 740, 93, 80));

        btn0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 740, 93, 80));

        decimal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });
        jPanel1.add(decimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 740, 93, 80));

        equal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        jPanel1.add(equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 740, 93, 80));

        plus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel1.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 93, 80));

        minus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        jPanel1.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 93, 80));

        mul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mul.setText("X");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });
        jPanel1.add(mul, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 93, 80));

        div.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        jPanel1.add(div, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 93, 80));

        screen.setEditable(false);
        screen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        screen.setBorder(null);
        jPanel1.add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 450, 130));

        ac.setBackground(new java.awt.Color(255, 0, 51));
        ac.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ac.setText("AC");
        ac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });
        jPanel1.add(ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 90, 50));

        del.setBackground(new java.awt.Color(255, 0, 51));
        del.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        del.setText("DEL");
        del.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        jPanel1.add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 90, 50));

        closingParenthesis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        closingParenthesis.setText(")");
        closingParenthesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closingParenthesisActionPerformed(evt);
            }
        });
        jPanel1.add(closingParenthesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 90, 80));

        shift.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        shift.setText("Shift");
        shift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftActionPerformed(evt);
            }
        });
        jPanel1.add(shift, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 93, 80));

        openingParenthesis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        openingParenthesis.setText("(");
        openingParenthesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openingParenthesisActionPerformed(evt);
            }
        });
        jPanel1.add(openingParenthesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 90, 80));

        trigonmetry.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        trigonmetry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "trigonometry", "------------------", "sin ", "cos", "tan", " " }));
        trigonmetry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trigonmetryActionPerformed(evt);
            }
        });
        jPanel1.add(trigonmetry, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       
        exp+="7";
        screen.setText(exp);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
           exp+="1";
           screen.setText(exp);
    }//GEN-LAST:event_btn1ActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
           exp=exp.substring(0,exp.length()-1);
           screen.setText(exp);
    }//GEN-LAST:event_delActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       exp+="2";
       screen.setText(exp);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       exp+="3";
       screen.setText(exp);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       exp+="4";
       screen.setText(exp);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        
       exp+="5";
       screen.setText(exp);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       exp+="6";
       screen.setText(exp);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       exp+="8";
       screen.setText(exp);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       exp+="9";
       screen.setText(exp);
    }//GEN-LAST:event_btn9ActionPerformed

    private void openingParenthesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openingParenthesisActionPerformed
       exp+="(";
       screen.setText(exp);
    }//GEN-LAST:event_openingParenthesisActionPerformed

    private void closingParenthesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closingParenthesisActionPerformed
       exp+=")";
       screen.setText(exp);
    }//GEN-LAST:event_closingParenthesisActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
       exp+=".";
       screen.setText(exp);
    }//GEN-LAST:event_decimalActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
       exp+="0";
       screen.setText(exp);
    }//GEN-LAST:event_btn0ActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
       exp+="/";
       screen.setText(exp);
    }//GEN-LAST:event_divActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
       exp+="*";
       screen.setText(exp);
    }//GEN-LAST:event_mulActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
       exp+="-";
       screen.setText(exp);

    }//GEN-LAST:event_minusActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
       exp+='+';
       screen.setText(exp);
    }//GEN-LAST:event_plusActionPerformed
    
    //function to perform mathematical operation
    public double evaluate(char op,double num1,double num2)
    {
        if(op=='+'){
            return num1+num2;
        }
        else if(op=='-'){
            return num2-num1;
        }
        else if(op=='*'){
            return num2*num1;
        }
        else if(op=='/'){
            
            if(num1!=0){
                return num2/num1;
            }
            else if(num1==0){
                 Invalid=1;    
            }
        }
      return 0;
    }
    
    //function to check precidence of any operator
    public boolean precedence(char op1,char op2)
    {   
        if(op2=='(' || op2==')'){
            return false;
        }
        else if((op1=='*'||op1=='/')&&(op2=='+'||op2=='-')){
            return false;
        }
        else
            return true;
        
    }
    
    //function to evaluate the total expression
    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        
        
       //in case of arithmetical operations
       if(flagForTrigonmetry==0){
           
        char[] expArray=exp.toCharArray();
 
        //creating stacks to store numbers and operators seperately.
        Stack<Double> numbers=new Stack<Double>();
        Stack<Character> operators=new Stack<Character>();
        
        //flag to check if negation is required
        int negetive=0;
        
        for(int i=0;i<expArray.length;i++)
        {
            if(expArray[i] == ' '){
             
                continue;
            }
 
            //if any number is found ,it is stacked in numbers
            if((expArray[i]>='0' && expArray[i]<='9')||expArray[i]=='.')
            {   
                String temp=" ";
                
                //if(~)is encountered then the immidiate number after that has to negated
                if(i!=0){
                    if(expArray[i-1]=='~')
                    {
                         negetive=1;
                    }
                }
                while(i<expArray.length && ((expArray[i]>='0' && expArray[i]<='9')||(expArray[i]=='.')))
                {
                    temp+=expArray[i];
                    i++;
                }
                double temp2=Double.parseDouble(temp);
                
                if(negetive==1)
                {   
                   
                    numbers.push(temp2*(-1));
                    System.out.println((-1)*temp2);
                    negetive=0;
                    
                }
                else
                {
                    numbers.push(temp2);
                }
                i--;
            }
            if(expArray[i]=='(')
            {
                operators.push('(');
                
                
            }
            
            //if closing parenthesis is encountered then the whole portion
            //in the parenthesis has to evaluated
            if(expArray[i]==')')
            {
                while(operators.peek()!='(')
                {
                    double partialAns=evaluate(operators.pop(),numbers.pop(),numbers.pop());
                    numbers.push(partialAns);
                }
                operators.pop(); 
               
            }
            if(expArray[i]=='+'||expArray[i]=='-'||expArray[i]=='*'||expArray[i]=='/')
            {
                while(!operators.empty() && precedence(expArray[i],operators.peek()))
                {
                    double partialAns2=evaluate(operators.pop(),numbers.pop(),numbers.pop());
                    numbers.push(partialAns2);
                }
                operators.push(expArray[i]);
             
            }
            
        }
            
             while(!operators.empty())
                {
                    double partialAns3=evaluate(operators.pop(),numbers.pop(),numbers.pop());
                    numbers.push(partialAns3);
                }
        
         
        if(Invalid==0){
            screen.setText(numbers.pop().toString());
        }
        else
        {
            screen.setText("Invalid Input.");
            Invalid=0;
        }
      }
       else
       {   
           
           //flag for the argument when negetive
           int negetive_argument=0,negetive_before_arg=0;
           
           double value = 0,argument;
           String operation="",argument_str="";
           
           char[] expForTri=exp.toCharArray();
                    
                for(int i=0;i<exp.length();i++)
                {   
                    
                    if(expForTri[i]>='a'&&expForTri[i]<='z')
                    {   
                        if(i!=0 && expForTri[i-1]=='~')
                         {
                             negetive_before_arg=1;
                        }
                        operation+=expForTri[i];
                    }
                    if((expForTri[i]>='0'&&expForTri[i]<='9')||(expForTri[i]=='.'))
                    {   
                        if(i!=0 && expForTri[i-1]=='~')
                         {
                           negetive_argument=1;
                        }
                        argument_str+=expForTri[i];
                    }
                }
        
               
                argument=Double.parseDouble(argument_str);
                
                
                if(negetive_argument==1)
                {
                    argument*=(-1);
                    negetive_argument=0;
                }
                
                //if shift is pressed then we need the inverse of sin,cos and tan
                //otherwise we need the value of sin,cos or tan
              
                if(isShift==0){

                argument=Math.toRadians(argument);
                
                if("sin".equals(operation)){       
                    value=Math.sin(argument);   
                }
                if("cos".equals(operation)){                    
                    value=Math.cos(argument);   
                }
                if("tan".equals(operation)){
                    value=Math.tan(argument);
                   
                }
    
               
              }
              else
              {
                if("sin".equals(operation)){       
                    value=Math.toDegrees(Math.asin(argument));   
                }
                if("cos".equals(operation)){                    
                     value=Math.toDegrees(Math.acos(argument)); 
                }
                if("tan".equals(operation)){
                    value=Math.toDegrees(Math.atan(argument));
                    
                    
                isShift=0;
                   
                }
              }
              if(negetive_before_arg==1){
                    value*=(-1);
                    screen.setText(Double.toString(value));
                    negetive_before_arg=0;
                }
                else
                {
                    screen.setText(Double.toString(value));
                }
              
              
              flagForTrigonmetry=0;
       }
        
            
     
        
    }//GEN-LAST:event_equalActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
       exp=" ";
       screen.setText(exp);
    }//GEN-LAST:event_acActionPerformed

    private void trigonmetryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trigonmetryActionPerformed
        
       
            String triOp=(String)trigonmetry.getSelectedItem();
            flagForTrigonmetry=1;
            exp+=triOp;
            exp+=" ";
            screen.setText(exp);
            

        
    }//GEN-LAST:event_trigonmetryActionPerformed

    private void negateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negateActionPerformed
        exp+="~";
        screen.setText(exp);
    }//GEN-LAST:event_negateActionPerformed

    private void shiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftActionPerformed
            isShift=1;
    }//GEN-LAST:event_shiftActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ac;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton closingParenthesis;
    private javax.swing.JButton decimal;
    private javax.swing.JButton del;
    private javax.swing.JButton div;
    private javax.swing.JButton equal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton minus;
    private javax.swing.JButton mul;
    private javax.swing.JButton negate;
    private javax.swing.JButton openingParenthesis;
    private javax.swing.JButton plus;
    private javax.swing.JTextField screen;
    private javax.swing.JButton shift;
    private javax.swing.JComboBox<String> trigonmetry;
    // End of variables declaration//GEN-END:variables
}
