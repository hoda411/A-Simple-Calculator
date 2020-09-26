
package project_gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class Calculator  extends  JFrame{
  // ******************************* STRAT *******************************
   // **** STRAT ****
    JPanel p1;
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35;
    
    JTextField t1;
    
     Font f= new Font("Arial", Font.BOLD, 13);
     Font a= new Font("Arial", Font.BOLD, 17);
    Font k= new Font("Arial", Font.BOLD, 22);
     Font z= new Font("Arial", Font.BOLD,9);
     
     inner i = new inner();
     
     
	 double x=0,y=0,result=0;
	int operator=0; int op,op1,m=0,E=0,R=0;
        boolean flag =false;
        boolean h=false;
        int l=0,G=0,O=0,K=0;
        
        
         Calculator(){
        
        // **** Setting Properties of the Frame ****
         this.setTitle("Calculator");
        this.setSize(335,490);
        this.setVisible(true);
        this.setLocation(100, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
   
         
         // ****  Start Adding Elements on Frame ****
         
         
         p1=new JPanel();
        p1.setBackground(Color.WHITE);
        this.add(p1);
        p1.setLayout(null);
        
        
        t1=new JTextField();
        t1.setBounds(40, 15, 250, 40);
        
         p1.add(t1);  
                
        
     b18=new JButton("sin()");
        b18.setBounds(15, 70, 65,30);
        b18.setBackground(Color.GRAY);
        b18.setForeground(Color.WHITE);
       p1.add(b18);
       
       b19=new JButton("cos()");
        b19.setBounds(95, 70, 65,30);
        b19.setBackground(Color.GRAY);
        b19.setForeground(Color.WHITE);
       p1.add(b19);
       
         b20=new JButton("tan()");
        b20.setBounds(170, 70, 65,30);
        b20.setBackground(Color.GRAY);
        b20.setForeground(Color.WHITE);
       p1.add(b20);
       
        b26=new JButton("log10(");
        b26.setBounds(245, 70, 70,30);
        b26.setBackground(Color.GRAY);
        b26.setForeground(Color.WHITE);
       p1.add(b26);
      
       b29=new JButton("! N");
        b29.setBounds(15, 115, 65,30);
        b29.setBackground(Color.GRAY);
        b29.setForeground(Color.WHITE);
       p1.add(b29);
       
        b34=new JButton("π");
        b34.setBounds(95, 115, 65,30);
        b34.setBackground(Color.GRAY);
        b34.setForeground(Color.WHITE);
       p1.add(b34);
       
       b17=new JButton("  %  ");
        b17.setBounds(170, 115, 65,30);
        b17.setBackground(Color.GRAY);
        b17.setForeground(Color.WHITE);
       p1.add(b17);
       
       
       b22=new JButton(" ^ ");
        b22.setBounds(245,115, 65,30);
        b22.setBackground(Color.GRAY);
        b22.setForeground(Color.WHITE);
       p1.add(b22);
       
       
        b1=new JButton("  1  ");
        b1.setBounds(15, 160, 65,30);
        b1.setBackground(Color.PINK);
        b1.setForeground(Color.WHITE);
       p1.add(b1);
       
        b2=new JButton("  2  ");
        b2.setBounds(95, 160, 65,30);
        b2.setBackground(Color.PINK);
        b2.setForeground(Color.WHITE);
       p1.add(b2);
       
       b3=new JButton("  3  ");
        b3.setBounds(170,160, 65,30);
        b3.setBackground(Color.PINK);
        b3.setForeground(Color.WHITE);
       p1.add(b3);
       
        b14=new JButton(" * ");
        b14.setBounds(245,160, 65,30);
        b14.setBackground(Color.GRAY);
        b14.setForeground(Color.WHITE);
       p1.add(b14);
       
        b4=new JButton("  4  ");
        b4.setBounds(15, 210, 65,30);
        b4.setBackground(Color.PINK);
        b4.setForeground(Color.WHITE);
       p1.add(b4);
       
        b5=new JButton("  5  ");
        b5.setBounds(95, 210, 65,30);
        b5.setBackground(Color.PINK);
        b5.setForeground(Color.WHITE);
       p1.add(b5);
       
       b6=new JButton("  6  ");
        b6.setBounds(170, 210, 65,30);
        b6.setBackground(Color.PINK);
        b6.setForeground(Color.WHITE);
       p1.add(b6);
       
         b12=new JButton("  +  ");
        b12.setBounds(245, 210, 65,30);
        b12.setBackground(Color.GRAY);
        b12.setForeground(Color.WHITE);
       p1.add(b12);
       
       
     
       
       b7=new JButton("  7  ");
        b7.setBounds(15, 260, 65,30);
        b7.setBackground(Color.PINK);
        b7.setForeground(Color.WHITE);
       p1.add(b7);
       
       
       b8=new JButton("  8  ");
        b8.setBounds(95, 260, 65,30);
        b8.setBackground(Color.PINK);
        b8.setForeground(Color.WHITE);
       p1.add(b8);
       
       
        b9=new JButton("  9  ");
        b9.setBounds(170, 260, 65,30);
        b9.setBackground(Color.PINK);
        b9.setForeground(Color.WHITE);
       p1.add(b9);
       
       
       b13=new JButton("  -  ");
        b13.setBounds(245,260, 65,30);
        b13.setBackground(Color.GRAY);
        b13.setForeground(Color.WHITE);
       p1.add(b13);
       
       
        b11=new JButton("sqrt");
        b11.setBounds(15, 310, 65,30);
        b11.setBackground(Color.GRAY);
        b11.setForeground(Color.WHITE);
       p1.add(b11);
       
       
       
       b10=new JButton("  0  ");
        b10.setBounds(95, 310, 65,30);
        b10.setBackground(Color.PINK);
        b10.setForeground(Color.WHITE);
       p1.add(b10);
       
       
       
       b16=new JButton("  .  ");
        b16.setBounds(170, 310, 65,30);
        b16.setBackground(Color.GRAY);
        b16.setForeground(Color.WHITE);
       p1.add(b16);
       
       
       
       b15=new JButton("  /  ");
        b15.setBounds(245, 310, 65,30);
        b15.setBackground(Color.GRAY);
        b15.setForeground(Color.WHITE);
       p1.add(b15);
       
       
       b30=new JButton("10^X");
        b30.setBounds(15, 360, 65,30);
        b30.setBackground(Color.GRAY);
        b30.setForeground(Color.WHITE);
       p1.add(b30);
       
       
        b31=new JButton("+/-");
        b31.setBounds(95, 360, 65,30);
        b31.setBackground(Color.GRAY);
        b31.setForeground(Color.WHITE);
       p1.add(b31);
       
       
       b32=new JButton("| X |");
        b32.setBounds(170, 360, 65,30);
        b32.setBackground(Color.GRAY);
        b32.setForeground(Color.WHITE);
       p1.add(b32);
       
      
        b21=new JButton("AC");
        
        b21.setBounds(245, 360, 65,30);
        b21.setBackground(Color.GRAY);
        b21.setForeground(Color.WHITE);
       p1.add(b21);
       
       
        b33=new JButton("OFF");
        b33.setBounds(15, 410, 65,30);
        b33.setBackground(Color.PINK);
        b33.setForeground(Color.WHITE);
       p1.add(b33);
       
       
        b28=new JButton("  =  ");
        b28.setBounds(95, 410, 65,30);
        b28.setBackground(Color.GRAY);
        b28.setForeground(Color.WHITE);
       p1.add(b28);
       
       
       b25=new JButton("DEL");
        b25.setBounds(170, 410, 65,30);
        b25.setBackground(Color.GRAY);
        b25.setForeground(Color.WHITE);
       p1.add(b25);
       
      
       
       b35=new JButton("ON");
        b35.setBounds(245, 410, 65,30);
        b35.setBackground(Color.PINK);
        b35.setForeground(Color.WHITE);
       p1.add(b35);
       
        // **** Start setting Font to Elements ****
        
           
                     t1.setFont(a);
            b1.setFont(a);      b2.setFont(a);   b3.setFont(a);
            b4.setFont(a);     b5.setFont(a);
           b6.setFont(a);    b7.setFont(a);   b8.setFont(a); 
          b9.setFont(a);      b10.setFont(a);
            b11.setFont(f);  b12.setFont(a);   b13.setFont(k);
            b14.setFont(k); b15.setFont(a);
            b16.setFont(k);  b17.setFont(f);   b18.setFont(f); 
            b19.setFont(f); b20.setFont(f);
            b21.setFont(f);  b22.setFont(a);    b25.setFont(f);
            b26.setFont(z); b35.setFont(f);    b28.setFont(a); 
            b29.setFont(f); b30.setFont(f);
            b31.setFont(f); b32.setFont(f);
            b33.setFont(f); b34.setFont(f);
         
         
         // **** Start ActionListener ****
         
         
        b1.addActionListener(i);    b2.addActionListener(i); b3.addActionListener(i); b4.addActionListener(i);
        b5.addActionListener(i);   b6.addActionListener(i);  b7.addActionListener(i);  b8.addActionListener(i);
        b9.addActionListener(i);  b10.addActionListener(i);   b16.addActionListener(i);  
   
        b12.addActionListener(i); b13.addActionListener(i); b14.addActionListener(i); b15.addActionListener(i); 
        b28.addActionListener(i);   b17.addActionListener(i);  b22.addActionListener(i);
        b21.addActionListener(i);     b25.addActionListener(i);  
        b18.addActionListener(i);  b19.addActionListener(i); b20.addActionListener(i); b26.addActionListener(i);
         b11.addActionListener(i);  b29.addActionListener(i); b31.addActionListener(i); b32.addActionListener(i);
         b33.addActionListener(i);  b35.addActionListener(i); b34.addActionListener(i); b30.addActionListener(i);
    }
    
    
    // **** Inner Class To Implement ActionListener ****
    
    private class inner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==b1)
		t1.setText(t1.getText().concat("1"));
            
            if(ae.getSource()==b2)
		t1.setText(t1.getText().concat("2"));
            
            if(ae.getSource()==b3)
		t1.setText(t1.getText().concat("3"));
            
            if(ae.getSource()==b4)
		t1.setText(t1.getText().concat("4"));
            
            if(ae.getSource()==b5)
		t1.setText(t1.getText().concat("5"));
            
            if(ae.getSource()==b6)
		t1.setText(t1.getText().concat("6"));
            
            if(ae.getSource()==b7)
		t1.setText(t1.getText().concat("7"));
            
            if(ae.getSource()==b8)
		t1.setText(t1.getText().concat("8"));
            
            if(ae.getSource()==b9)
		t1.setText(t1.getText().concat("9"));
            
             if(ae.getSource()==b10)
		t1.setText(t1.getText().concat("0"));
             
             if(ae.getSource()==b16)
             {
              if (t1.getText().contains(".")) {
                return;
            } else {
                t1.setText(t1.getText() + ".");
            }
             }
             
              if(ae.getSource()==b12){
                 
		x=Double.parseDouble(t1.getText());
		operator=1;
		t1.setText("");
		}     
              
              if(ae.getSource()==b13){
		x=Double.parseDouble(t1.getText());
		operator=2;
		t1.setText("");
		}  
              
              if(ae.getSource()==b14){
		x=Double.parseDouble(t1.getText());
		operator=3;
		t1.setText("");
		}         
           
             
              
               if(ae.getSource()==b15){
		x=Double.parseDouble(t1.getText());
		operator=4;
		t1.setText("");
		}  
               
               
                if(ae.getSource()==b17){
		x=Double.parseDouble(t1.getText());
		operator=5;
		t1.setText("");
		}    
                
              if(ae.getSource()==b22){
		x=Double.parseDouble(t1.getText());
		operator=6;
		t1.setText("");
		}    
              
              if(ae.getSource()==b21){
                  t1.setText("");
              }
              
              if(ae.getSource()==b25){
               String ss=t1.getText();
		t1.setText("");
		for(int i=0;i<ss.length()-1;i++)
		t1.setText(t1.getText()+ss.charAt(i));
              }
              

              
              if(ae.getSource()==b18){
             
                op=1; 
                flag = true;
                t1.setText("");
                }
                if(ae.getSource()==b19){
                   
                op=2; 
                flag = true;
                t1.setText("");
                }
                if(ae.getSource()==b20){
                   
                op=3;
                flag = true;
                t1.setText("");
                }
                
                if(ae.getSource()==b26){
                  
                op1=1;
                h = true;
                t1.setText("");
                }
                
                 if(ae.getSource()==b11){
                  
                op1=2;
                h = true;
                t1.setText("");
                }
                 
                 if(ae.getSource()==b29){
                  
                op1=3;
                h = true;
                t1.setText("");
                }
                  if(ae.getSource()==b32){
                  
                op1=4;
                h = true;
                t1.setText("");
                }
                 if(ae.getSource()==b31){
                  t1.setText("");
               if(l==0){
                   t1.setText("-"); l=1;
               }
               else{
                  t1.setText(""); l=0;  
               }
                }
                 
                  if(ae.getSource()==b34){
                  
               t1.setText(t1.getText().concat("3.141592654"));
                } 
                  
                 if(ae.getSource()==b33){
              Disable();
                }
                 
                 if(ae.getSource()==b35){
              Enable();
                }
                 
                  
                   if(ae.getSource()==b30){
                  
                op1=5;
                h = true;
                t1.setText("");
                }
                   
                 
                 
                if(ae.getSource()==b28&&flag == true){
                x=Double.parseDouble(t1.getText());
                switch(op){
                    case 1: 
                         double radians = Math.toRadians(x); 
                        result=Math.sin(radians); flag=false;
                    break;
                    case 2:
                        double Radians = Math.toRadians(x); 
                        result=Math.cos(Radians); flag=false;
                    break;
                    case 3:
                       if(x==90||x==270)
                           O=1;
                       else{
                        double radian = Math.toRadians(x); 
                        result=Math.tan(radian);flag=false; 
                        O=0;
                       }
                        
                    break;
                   
                    
                }
                if(O==1){
                    t1.setText("Math Error"); O=0;
                }
                else if(O==0){
                    t1.setText(""+result);
                }
                
                }


                else if(ae.getSource()==b28&&h == true){
                   switch(op1){
                    case 1: 
                  m=Integer.parseInt(t1.getText());
                  if(m<0){
                      K=1;
                  }
                  else{
                      result=Math.log10(m);h=false; K=0;
                  }
                  break;
                   case 2: 
                  x=Double.parseDouble(t1.getText());
                  if(x<0)
                      G=1;
                  else{
                    result=Math.pow(x, 0.5);
                  h=false;
                  G=0;
                  }
                  
                  break;
                  
                   case 3: 
                  m=Integer.parseInt(t1.getText());
                  long fact=1;
                  for( int i=1;i<=m;i++){
                      fact*=i;
                  }
                  result=fact;h=false;
                  break;
                  
                  case 4: 
                  x=Double.parseDouble(t1.getText());
                  result=Math.abs(x);
                  h=false;
                  break;
                  
               
                  
                  case 5: 
                  int t=Integer.parseInt(t1.getText());
                   
                  result=Math.pow(10, t); h=false;
		break;
                
                 
                   }
                    if(G==1||K==1){
                        t1.setText("Math Error"); G=0; K=0;
                    }
                    else if(G==0||K==0)     
                    {
                        t1.setText(""+result); 
                    }
                    
              }
            


                else if(ae.getSource()==b28 ){
                  y=Double.parseDouble(t1.getText());
                  switch(operator){
		case 1: result=x+y;
		break;
                
                case 2: result=x-y;
		break;
                
                case 3: result=x*y;
		break;
                
                case 4:
                if(y==0) {
                    E=1;
                  }
                else{
                    {
                         result=x/y; E=0;
                    }
		
                }
                break;
                 case 5:
                      
                     
                  result=x%y;
		break;
                
                case 6: result=Math.pow(x, y);
		break;
                
              }
                  if(E==1)
                  {
                       t1.setText("Error"); E=0;
                  }
                  else if(E==0)
              t1.setText(""+result);
        }
        
        
        
        
        }
        
        // **** Functions Enable And Disable ****
         public void Disable() { 
             t1.setText("");
          t1 .setEnabled(false);  
           b1 .setEnabled(false);
           b2 .setEnabled(false);
           b3 .setEnabled(false);
           b4 .setEnabled(false);
           b5 .setEnabled(false);
           b6 .setEnabled(false);
           b7 .setEnabled(false);
           b8 .setEnabled(false);
           b9 .setEnabled(false);
           b10 .setEnabled(false);
           b11 .setEnabled(false);
           b12 .setEnabled(false);
           b13 .setEnabled(false);
           b14 .setEnabled(false);
           b15 .setEnabled(false);
           b16.setEnabled(false);
           b17 .setEnabled(false);
           b18 .setEnabled(false);
           b19.setEnabled(false);
           b20.setEnabled(false);
           b21 .setEnabled(false);
           b22 .setEnabled(false);
           b25 .setEnabled(false);
           b26 .setEnabled(false);
           
           b28 .setEnabled(false);
           b29 .setEnabled(false);
           b30 .setEnabled(false);
           b31 .setEnabled(false);
           b32 .setEnabled(false);
           b33 .setEnabled(false);
           b34 .setEnabled(false);
        }
         
         
         public void Enable() {
             
          t1 .setEnabled(true);
         
           b1 .setEnabled(true);
           b2 .setEnabled(true);
           b3 .setEnabled(true);
           b4 .setEnabled(true);
           b5 .setEnabled(true);
           b6 .setEnabled(true);
           b7 .setEnabled(true);
           b8 .setEnabled(true);
           b9 .setEnabled(true);
           b10 .setEnabled(true);
           b11 .setEnabled(true);
           b12 .setEnabled(true);
           b13 .setEnabled(true);
           b14 .setEnabled(true);
           b15 .setEnabled(true);
           b16.setEnabled(true);
           b17 .setEnabled(true);
           b18 .setEnabled(true);
           b19.setEnabled(true);
           b20.setEnabled(true);
           b21 .setEnabled(true);
           b22 .setEnabled(true);
           b25 .setEnabled(true);
           b26 .setEnabled(true);
          
           b28 .setEnabled(true);
           b29 .setEnabled(true);
           b30 .setEnabled(true);
           b31 .setEnabled(true);
           b32 .setEnabled(true);
           b33 .setEnabled(true);
           b34 .setEnabled(true);
        }
    
}}