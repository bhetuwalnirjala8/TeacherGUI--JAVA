//Code of TeacherGUI class

import javax.swing.*;  // Importing the necessary classes for creating GUI components
import java.awt.*;  //Importing classes for basic GUI functionality
import java.awt.event.*; //Importing classes for handling GUI events
import java.util.*; //Importing utility classes like ArrayList

public class TeacherGUI //Defining a class named TeacherGUI
{   
    private ArrayList<Teacher>tlist = new ArrayList<Teacher>(); //Declaring an ArrayList to store Teacher objects
    private JFrame jf;
    private JPanel jp;
    private JPanel panel1;
    private JButton b1,b2,b3,b4,b5,b6,b7;
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    public void landing_frame() //method to create the landing frame
    {
        //Creating a new JFrame with the title "TeacherGUI"
        JFrame jf = new JFrame("TeacherGUI");
        JPanel jp = new JPanel(); //Creating a new JPanel
        
            
    
        //When the user closes the JFrame window by clicking the close button, this setting ensures that the entire application terminates
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(2100,1500);  //Setting the size of the frame
        jf.setLayout(null);  //Setting layout to null for custom positioning
        jf.getContentPane().setBackground(new Color(116,92,151)); //Setting backgground colour
        jf.setVisible(true);//Making the frame Visible
            
            
        
        // Adding main heading label
        JLabel h1 = new JLabel("Teacher-GUI Interface");
        h1.setBounds(550, 15, 500, 70); //Setting the position and size of the frame
        Font headingFont = new Font("Times New Roman", Font.BOLD, 49); // Creating a font for the heading
        Color color = new Color(255,249,174); // creating a color for the font 
        h1.setForeground(color);  // setting font colour
        h1.setFont(headingFont);
        jf.add(h1); //adding the label to the frame
        
        
        
        
        //Adding buttons for lecturer for different functionalities
        JButton b1 = new JButton("Lecturer");
        b1.setBounds(540, 150, 500, 250);
        Font headingFont1 = new Font("Times New Roman", Font.PLAIN, 70);
        b1.setFont(headingFont1); 
        b1.setForeground(new Color(26, 36, 33));
        b1.setBackground(new Color(196,177,225)); 
        
    
        b1.addActionListener(new ActionListener() //adding action listener to perform an action when the button is clicked
        {
            public void actionPerformed(ActionEvent ae)
            {
                jf.dispose();  //Disposes the current JFrame, closing the window and releasing corresponding resources
                
                LecturerGUI();  // Calls the method to create the GUI for adding a lecturer, transitioning to the lecturer interface
            }
        });
        
        jf.add(b1); //adding the button to the frame
        
        
        //Adding buttons for tutor for different functionalities
        JButton b2 = new JButton("Tutor");
        b2.setBounds(540, 420, 500, 250); //setting size of the frame as x-axis, y-axis, length and height
        b2.setFont(headingFont1);
        b2.setForeground(new Color(26, 36, 33));
        Font headingFont2 = new Font("Times New Roman", Font.PLAIN, 70);
        b2.setBackground(new Color(196, 177, 225));
        b2.addActionListener(new ActionListener()  //adding action listener to perform an action when the button is clicked
        {
            public void actionPerformed(ActionEvent ae)
            {
                jf.dispose(); // Disposes the current JFrame, closing the window and releasing corresponding resources
                
                TutorGUI();  // Calls the method to create the GUI for adding a tutor, transitioning to the tutor interface
            }
        });
        jf.add(b2);
        
        jf.setVisible(true); //makes frame visible on the screen
    }
    
    //Method to create the GUI for adding Lecturer 
    private void LecturerGUI()
    {
        //Creating a new JFrame for the Lecturer GUI 
        JFrame jf = new JFrame("Lecturer");
        jf.setSize(2100,1500); //setting size of the frame
        jf.getContentPane().setBackground(new Color(196, 177, 225)); //background color of the frame
        jf.setLayout(null);
        
        
        
        //main heading label for the Lecturer GUI
        JLabel h2 = new JLabel("LECTURER GUI");
        h2.setBounds(603, 40, 500, 70);
        Font headingFont3 = new Font("Times New Roman", Font.BOLD, 40); //heading font
        h2.setFont(headingFont3);
        h2.setForeground(new Color(255,249,174)); //font color
        jf.add(h2);
        jf.setVisible(true); //adding the label to the frame
        
        

        
        
        Font SubheadingFont = new Font("Times New Roman", Font.PLAIN, 31);// defining a font for subheadings
        //Left side of the frame
        //creating a JLabel for teacher ID with specific bounds, font, and colour
        JLabel l1 = new JLabel("Teacher ID");
        l1.setBounds(70, 160, 300, 30);
        l1.setFont(SubheadingFont);
        l1.setForeground(new Color(0,0,0));
        jf.add(l1);
        
        //Creating a JTextField for entering teacher ID
        JTextField t1 = new JTextField();
        t1.setBounds(280, 161, 260, 30); // setting bounds for the text field
        jf.add(t1); //adding the text filled to the JFrame
        
        
        // same process for each label and text field as "Teacher ID" for different attributes of teacher
        JLabel l2 = new JLabel("Teacher Name");
        l2.setBounds(70, 220, 300, 30);
        l2.setFont(SubheadingFont);
        l2.setForeground(new Color(0,0,0));
        jf.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(280, 220, 260, 30);
        jf.add(t2);
        //
        JLabel l3 = new JLabel("Address");
        l3.setBounds(70, 280, 300, 30);
        l3.setFont(SubheadingFont);
        l3.setForeground(new Color(0,0,0));
        jf.add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(280, 280, 260, 30);
        jf.add(t3);
        
        JLabel l4 = new JLabel("Working Type");
        l4.setBounds(70, 337, 300, 30);
        l4.setFont(SubheadingFont);
        l4.setForeground(new Color(0,0,0));
        jf.add(l4);
        
        
        JTextField t4= new JTextField();
        t4.setBounds(280, 337, 260, 30);
        jf.add(t4);
        

        //Right side of the frame
        JLabel l5 = new JLabel("Years of Experience");
        l5.setBounds(850, 160, 300, 30);
        l5.setFont(SubheadingFont);
        l5.setForeground(new Color(0,0,0));
        jf.add(l5);

        JTextField t5 = new JTextField();
        t5.setBounds(1150, 161, 260, 30);
        jf.add(t5);
        
        JLabel l6 = new JLabel("Department");
        l6.setBounds(850, 220, 300, 30);
        l6.setFont(SubheadingFont);
        l6.setForeground(new Color(0,0,0));
        jf.add(l6);
        
        JTextField t6 = new JTextField();
        t6.setBounds(1150, 220, 260, 30);
        jf.add(t6);
        
        
        JLabel l7 = new JLabel("Employment Status");
        l7.setBounds(850, 280, 300, 30);
        l7.setFont(SubheadingFont);
        l7.setForeground(new Color(0,0,0));
        jf.add(l7);

        JTextField t7 = new JTextField();
        t7.setBounds(1150, 280, 260, 30);
        jf.add(t7);

        
        JLabel l8 = new JLabel("Working Hours");
        l8.setBounds(850, 337, 300, 30);
        l8.setFont(SubheadingFont);
        l8.setForeground(new Color(0,0,0));
        jf.add(l8);

        JTextField t8 = new JTextField();
        t8.setBounds(1150, 337, 260, 30);
        jf.add(t8);
        
        JLabel l9 = new JLabel("Teacher ID");
        l9.setBounds(70, 500, 300, 30);
        l9.setFont(SubheadingFont);
        l9.setForeground(new Color(0,0,0));
        jf.add(l9);

        JTextField t9 = new JTextField();
        t9.setBounds(280, 500, 260, 30);
        jf.add(t9);
        
        
        JLabel l10 = new JLabel("Graded Score");
        l10.setBounds(850, 500, 300, 30);
        l10.setFont(SubheadingFont);
        l10.setForeground(new Color(0,0,0));
        jf.add(l10);

        JTextField t10 = new JTextField();
        t10.setBounds(1150, 500, 260, 30);
        jf.add(t10);
        
        
        
        JLabel l11 = new JLabel("Department");
        l11.setBounds(70, 570, 300, 30);
        l11.setFont(SubheadingFont);
        l11.setForeground(new Color(0,0,0));
        jf.add(l11);

        JTextField t11 = new JTextField();
        t11.setBounds(280, 570, 260, 30);
        jf.add(t11);
        
        
        
        JLabel l12 = new JLabel("Years Of Experience");
        l12.setBounds(850, 570, 300, 30);
        l12.setFont(SubheadingFont);
        l12.setForeground(new Color(0,0,0));
        jf.add(l12);

        JTextField t12 = new JTextField();
        t12.setBounds(1150, 570, 260, 30);
        jf.add(t12);
        
        
        
    
        
        //Creating a JButton for adding a lecturer 
        JButton b1 = new JButton("Add a Lecturer");
        b1.setBounds(605, 161, 194, 50); //setting bound for the JButton
        jf.add(b1); //adding the button to the JFrame
        b1.addActionListener(new ActionListener() //adding actionListener to the button to handle click events
        {
            //@Overriding actionPerformed method
            public void actionPerformed(ActionEvent ae)
            {   
                //Checking if any of the required field is empty
                if
                (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() || t5.getText().isEmpty() || t6.getText().isEmpty() || 
                t7.getText().isEmpty() || t8.getText().isEmpty())
                    {
                     JOptionPane.showMessageDialog(b1,"Kindly fill all the required fields"); // showing error message if any of the field is empty
                    }
                    else
                    {
                    try
                    {   
                        //Parsing input values
                        int teacherId = Integer.parseInt(t1.getText());
                        String teacherName = t2.getText();
                        String address = t3.getText();
                        String workingType = t4.getText();
                        int yearsOfExperience = Integer.parseInt(t5.getText());
                        String department = t6.getText();
                        String employmentStatus = t7.getText();
                        int workingHours = Integer.parseInt(t8.getText());
                        
                        
                    
                        
                        // Creating a new Lecturer object
                        Lecturer l1 = new Lecturer(teacherId,teacherName,address,workingType,employmentStatus,workingHours,department,yearsOfExperience);
                        
                        // Adding the new lecturer to the tlist ArrayList
                        tlist.add(l1);
                                
                        // Displaying a success message
                        JOptionPane.showMessageDialog(b1, "Lecturer Added Successfully!");
                        
                        
                        // Displaying lecturer information in a message dialog
                        String tutorInfo =
                        "Teacher ID: " + teacherId + "\n" +
                        "Teacher Name: " + teacherName + "\n" +
                        "Address: " + address + "\n" +
                        "Working Type: " + workingType + "\n" +
                        "Years Of Experience: " + yearsOfExperience + "\n" +
                        "Department: " + department + "\n" +
                        "Employment Status: " + employmentStatus + "\n" +
                        "Working Hours: " + workingHours;
                    
                        JOptionPane.showMessageDialog(b1, tutorInfo, "Lecturer Information", JOptionPane.INFORMATION_MESSAGE);
        
                    }
                    catch(NumberFormatException e)
                    {
                            JOptionPane.showMessageDialog(null, "Invalid Input! Please enter an integer value."); //Handles invalid input
                    }
                    catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Invalid input "); //Handles other exception
                    }
                }
            }
        });
    
        
        
        //Creating a button for grading assignment
        JButton b2 = new JButton("Grade Assignment");
        b2.setBounds(605, 480, 199, 50);
        jf.add(b2);
        b2.addActionListener(new ActionListener() 
        {   
            //@Override actionPerformed method
            public void actionPerformed(ActionEvent ae)
            {
                if(t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() || t5.getText().isEmpty() || t6.getText().isEmpty() || 
                t7.getText().isEmpty() || t8.getText().isEmpty() || t9.getText().isEmpty() || t10.getText().isEmpty() || t11.getText().isEmpty() || t12.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(b2,"Kindly fill all the required fields");
                }
                else
                {
                    try
                    {
                        int teacherId = Integer.parseInt(t9.getText());
                        int gradedScore = Integer.parseInt(t10.getText());
                        String department = t11.getText();
                        int yearsOfExperience = Integer.parseInt(t12.getText());
                    
                        //Initializing teacher object
                        Teacher te = null;
                        for(Teacher t:tlist)  // Iterating through the tlist ArrayList to find the teacher with the given ID
                        {
                            if (t.getTeacherId()==teacherId)
                            {
                                te = t;
                                break;
                            }
                        }
                        if(te == null) //Checking if the teacher id is registered
                        {
                            JOptionPane.showMessageDialog(b2, "Teacher ID is not registered.");
                            return;
                        }
                        if(!(te instanceof Lecturer)) //Checking if the teacher is a Lecturer
                        {
                            JOptionPane.showMessageDialog(b2, "Teacher ID is registered but not a Lecturer.");
                            return; // Return if teacher is not a Lecturer
                        }
                        
                        //Casting the teacher to a Lecturer object
                        Lecturer l = (Lecturer) te;
                    
                        // Checking for invalid inputs
                        if (gradedScore < 0 || gradedScore > 100) 
                        {
                            JOptionPane.showMessageDialog(b2, "Invalid graded score. Please enter a value between 0 and 100.");
                            return;
                        }
                        
                        if (yearsOfExperience < 5) 
                        {
                            JOptionPane.showMessageDialog(b2, "Invalid years of experience. Please enter a valid yearsOfExperience.");
                            return;
                        }

                        //Checiking if the conditions are met for grading assignment
                        if(l.getDepartment().equals(department) && l.getYearsOfExperience() >= 5 && gradedScore >= 0 && gradedScore <= 100)
                        {
                            l.gradeAssignment(gradedScore,department,yearsOfExperience); //grading the assignment
                                
                            JOptionPane.showMessageDialog(b2, "Graded Successfully!");  //displaying a success mesage  
                        }  
                        else
                        {    
                                JOptionPane.showMessageDialog(b2,"Unable to grade at this time: Conditions not met for department."); //error message if the condition is not met
                        }
                    }
                    catch(NumberFormatException ne) 
                    {
                        JOptionPane.showMessageDialog(b2,"Alert! Invalid input detected. Please enter an integer value."); //handling invalid input
                    }
                }
            }
        });
        
        JButton b3 = new JButton("Display"); //Creating a JButton with label "Display" and setting its position and size
        b3.setBounds(605, 230, 194, 50);
        b3.addActionListener(new ActionListener() //adding actionListener to the button
        {
            public void actionPerformed(ActionEvent ae)
            {     
                     if
                     (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() || t5.getText().isEmpty() || t6.getText().isEmpty() || 
                     t7.getText().isEmpty() || t8.getText().isEmpty())
                     {
                            JOptionPane.showMessageDialog(b3,"Kindly fill all the required fields"); // showing error message if any of the field is empty
                            return;
                     }
                     for //looping through the tlist ArrayList
                     (Teacher t:tlist)
                      {
                        if(t instanceof Lecturer) //Checking if the teacher is an instance of Lecturer
                        {
                            t.display();  // Calling the display method for Lecturer
                        }
                      }
                     JOptionPane.showMessageDialog(null, "Lecturers displayed successfully in the console.", "Success", JOptionPane.INFORMATION_MESSAGE); // Displaying success message after displaying lecturers
                    }
        });
        jf.add(b3);
        
        JButton b4 = new JButton("Display");
        b4.setBounds(608, 547, 194, 50);
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                    if
                    (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() || t5.getText().isEmpty() || t6.getText().isEmpty() || 
                    t7.getText().isEmpty() || t8.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(b4,"Kindly fill all the required fields"); // showing error message if any of the field is empty
                        return;
                    }
                    for
                      (Teacher t:tlist)  //looping through the tlist ArrayList
                      {
                        if(t instanceof Lecturer)
                        {
                            t.display();
                        }
                      }
                    JOptionPane.showMessageDialog(null, "Value is displayed in the console succeessfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
        });
        
        jf.add(b4);
        
        JButton b5 = new JButton("Clear");
        b5.setBounds(608, 615, 194, 50);
        b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                t9.setText("");
                t10.setText("");
                t11.setText("");
                t12.setText("");
                JOptionPane.showMessageDialog(null,"The required fields are cleared!"); //clearing all the input values
            }  
        });
        
        jf.add(b5);
        
        
        
        JButton b6 = new JButton("Clear");
        b6.setBounds(605, 300, 194, 50);
        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                JOptionPane.showMessageDialog(null,"The required fields are cleared!"); //clearing all the input values
            }
        });
        
        jf.add(b6);
        
        
        
        JButton b7 = new JButton("Go To Tutor "); //creating a button for navigating to the Tutor section
        b7.setBounds(1210, 700, 200, 50);
        b7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jf.dispose(); //disposes the current frame
                
                TutorGUI(); // Calling TutorGUI method to navigate to Tutor section
            }
        });
        jf.add(b7);
        
        jf.setVisible(true);
        
        // Setting fonts and background colors for buttons of TutorGUI
        Font headingFont2 = new Font("Times New Roman", Font.PLAIN,21);
        b1.setFont(headingFont2);
        b1.setForeground(new Color(26, 36, 33));
        b1.setBackground(new Color(196,177,255));
        b2.setFont(headingFont2);  
        b2.setForeground(new Color(26, 36, 33)); //font color
        b2.setBackground(new Color(196,177,255)); //background color
        b3.setFont(headingFont2);
        b3.setForeground(new Color(26, 36, 33));
        b3.setBackground(new Color(196,177,255));
        b4.setFont(headingFont2);
        b4.setForeground(new Color(26, 36, 33));
        b4.setBackground(new Color(196,177,255));
        b5.setFont(headingFont2);
        b5.setForeground(new Color(26, 36, 33));
        b5.setBackground(new Color(196,177,255));
        b6.setFont(headingFont2);
        b6.setForeground(new Color(26, 36, 33));
        b6.setBackground(new Color( 196,177,255));
        b7.setFont(headingFont2);
        b7.setForeground(new Color(26, 36, 33)); 
        b7.setBackground(new Color( 196,177,255));
        
        
        JPanel panel1 = new JPanel();  // Creating a JPanel to add background color to a specific area
        panel1.setBounds(60, 35, 1416, 730);
        panel1.setBackground(new Color(116,92,151)); 
        jf.add(panel1);  // Adding the panel to the JFrame
        
    }
    
    
    
    // method to create Tutor GUI
    private void TutorGUI()
    {
        JFrame jf = new JFrame("Tutor");
        jf.setSize(2100,1500);
        jf.getContentPane().setBackground(new Color(196, 177, 225));
        jf.setLayout(null);
        
        JLabel h3 = new JLabel("Tutor GUI");
        h3.setBounds(655, 20, 700, 100);
        Font headingFont3 = new Font("Times New Roman", Font.BOLD, 40); //heading font
        h3.setFont(headingFont3);
        Color color = new Color(255,249,174); //font color
        h3.setForeground(color);
        jf.add(h3);
        
        Font SubheadingFont1 = new Font("Times New Roman", Font.PLAIN, 31);//body font
        //left side teacher ID for adding a lecturer
        JLabel l1 = new JLabel("Teacher ID");
        l1.setBounds(70, 160, 300, 30);
        l1.setFont(SubheadingFont1);
        l1.setForeground(new Color(0,0,0));
        jf.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(300, 161, 260, 30);
        jf.add(t1);
    
        JLabel l2 = new JLabel("Teacher Name");
        l2.setBounds(70, 230, 300, 30);
        l2.setFont(SubheadingFont1);
        l2.setForeground(new Color(0,0,0));
        jf.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(300, 230, 260, 30);
        jf.add(t2);
        //
        JLabel l3 = new JLabel("Address");
        l3.setBounds(70, 290, 300, 30);
        l3.setFont(SubheadingFont1);
        l3.setForeground(new Color(0,0,0));
        jf.add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(300, 290, 260, 30);
        jf.add(t3);
        
        
        JLabel l4 = new JLabel("Working Type");
        l4.setBounds(70, 350, 300, 30);
        l4.setFont(SubheadingFont1);
        l4.setForeground(new Color(0,0,0));
        jf.add(l4);

        JTextField t4 = new JTextField();
        t4.setBounds(300, 350, 260, 30);
        jf.add(t4);
        
        
        JLabel l5 = new JLabel("Salary");
        l5.setBounds(70, 410, 300, 30);
        l5.setFont(SubheadingFont1);
        l5.setForeground(new Color(0,0,0));
        jf.add(l5);

        JTextField t5 = new JTextField();
        t5.setBounds(300, 410, 260, 30);
        jf.add(t5);
    
        
        
        //Right Side of the frame
        JLabel l6 = new JLabel("Specialization");
        l6.setBounds(880, 160, 300, 30);
        l6.setFont(SubheadingFont1);
        l6.setForeground(new Color(0,0,0));
        jf.add(l6);

        JTextField t6 = new JTextField();
        t6.setBounds(1200, 160, 260, 30);
        jf.add(t6);
        
        
        JLabel l7 = new JLabel("Working Hours");
        l7.setBounds(880, 230, 300, 30);
        l7.setFont(SubheadingFont1);
        l7.setForeground(new Color(0,0,0));
        jf.add(l7);

        JTextField t7 = new JTextField();
        t7.setBounds(1200, 230, 260, 30);
        jf.add(t7);
        //
        //
        
        
        JLabel l8 = new JLabel("Academic Qualification");
        l8.setBounds(880, 290, 300, 30);
        l8.setFont(SubheadingFont1);
        l8.setForeground(new Color(0,0,0));
        jf.add(l8);

        JTextField t8 = new JTextField();
        t8.setBounds(1200, 289, 260, 30);
        jf.add(t8);
        
        
        JLabel l9 = new JLabel("Employment Status");
        l9.setBounds(880, 350, 300, 30);
        l9.setFont(SubheadingFont1);
        l9.setForeground(new Color(0,0,0));
        jf.add(l9);
        

        JTextField t9 = new JTextField();
        t9.setBounds(1200, 350, 260, 30);
        jf.add(t9);
        
        JLabel l10 = new JLabel("performanceIndex");
        l10.setBounds(880, 410, 300, 30);
        l10.setFont(SubheadingFont1);
        l10.setForeground(new Color(0,0,0));
        jf.add(l10);

        JTextField t10 = new JTextField();
        t10.setBounds(1200, 410, 260, 30);
        jf.add(t10);
        
        
        JLabel l11 = new JLabel("New Salary");
        l11.setBounds(70, 600, 300, 30);
        l11.setFont(SubheadingFont1);
        l11.setForeground(new Color(0,0,0));
        jf.add(l11);

        JTextField t11 = new JTextField();
        t11.setBounds(300, 600, 260, 30);
        jf.add(t11);
        
        
        JLabel l12 = new JLabel("New performanceIndex");
        l12.setBounds(880, 530, 300, 30);
        l12.setFont(SubheadingFont1);
        l12.setForeground(new Color(0,0,0));
        jf.add(l12);

        JTextField t12 = new JTextField();
        t12.setBounds(1200, 530, 260, 30);
        jf.add(t12);
        
        //left side teacher ID for setting salary
        JLabel l13 = new JLabel("Teacher ID");
        l13.setBounds(70, 530, 300, 30);
        l13.setFont(SubheadingFont1);
        l13.setForeground(new Color(0,0,0));
        jf.add(l13);

        JTextField t13 = new JTextField();
        t13.setBounds(300, 530, 260, 30);
        jf.add(t13);
        
        //left side teacher ID for removing tutor
        JLabel l14 = new JLabel("Teacher ID");
        l14.setBounds(70, 730, 300, 30);
        l14.setFont(SubheadingFont1);
        l14.setForeground(new Color(0,0,0));
        jf.add(l14);

        JTextField t14 = new JTextField();
        t14.setBounds(300, 730, 260, 30);
        jf.add(t14);
        
        
    
        
        
        
        
        // Creating a button for adding tutor
        JButton b1 = new JButton("Add a Tutor");
        b1.setBounds(638, 220, 170, 50);
        jf.add(b1);
        b1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                if
                (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() || t5.getText().isEmpty() || t6.getText().isEmpty() || 
                t7.getText().isEmpty() || t8.getText().isEmpty() || t9.getText().isEmpty() || t10.getText().isEmpty())
                    {
                     JOptionPane.showMessageDialog(b1,"Kindly fill all the required fields");
                    }
                    else
                    {
                    try
                    {
                        int teacherId = Integer.parseInt(t1.getText()); // parsing and retrieving data from text fields
                        
                        // Checking if the teacher ID exceeds 4 digits
                        if (String.valueOf(teacherId).length() > 4)
                        {
                            JOptionPane.showMessageDialog(b1, "Teacher ID should not exceed 4 digits.", "Invalid", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        String teacherName = t2.getText();
                        String address = t3.getText();
                        String workingType = t4.getText();
                        double salary = Integer.parseInt(t5.getText());
                        String specialization = t6.getText();
                        int workingHours = Integer.parseInt(t7.getText());
                        String academicQualifications = t8.getText();
                        String employmentStatus = t9.getText();
                        int performanceIndex = Integer.parseInt(t10.getText());
                        
                        
                        
                        if(workingHours < 20) //validating working hours
                        {
                            JOptionPane.showMessageDialog(b1, "Please ensure that the tutor's working hours should be greater than 20.","Invalid",JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        if(performanceIndex >=5  && performanceIndex <= 10) //validating performance index
                        {
                               // Creating a new tutor object
                               Tutor tutor = new Tutor(teacherId,teacherName,address,workingType,employmentStatus,workingHours,salary,specialization,
                               academicQualifications,performanceIndex);
                                
                               // Adding the new tutor to the tlist ArrayList
                               tlist.add(tutor);
                                        
                               // Displaying a success message
                               JOptionPane.showMessageDialog(b1, "Tutor Added Successfully!");
                                
                               // Displaying tutor information in a message dialog
                               String tutorInfo = "Teacher ID: " + teacherId + "\n" +
                               "Teacher Name: " + teacherName + "\n" +
                               "Address: " + address + "\n" +
                               "Working Type: " + workingType + "\n" +
                               "Salary: " + salary + "\n" +
                               "Specialization: " + specialization + "\n" +
                               "Working Hours: " + workingHours + "\n" +
                               "Academic Qualifications: " + academicQualifications + "\n" +
                               "Employment Status: " + employmentStatus + "\n" +
                               "Performance Index: " + performanceIndex;
                               JOptionPane.showMessageDialog(b1, tutorInfo, "Tutor Information", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(b1, "performanceIndex must be between 5 and 10."); //condition for performance index
                        }
                    }
                    catch(NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Invalid Input! Please enter an integer value.");
                    }
                    catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Invalid input ");
                    }
                }
            }
        });
        
        JButton b2 = new JButton("Set Salary of Tutor"); 
        b2.setBounds(629, 560, 195, 50);
        jf.add(b2);
        b2.addActionListener(new ActionListener()
        {   
            public void actionPerformed(ActionEvent ae)
            {   
                Tutor tutorObj;
                if(t13.getText().isEmpty() || t11.getText().isEmpty() || t12.getText().isEmpty())
                {
                        JOptionPane.showMessageDialog(b2,"Please ensure that all the text fields are filled.", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                        return;
                }
                else
                {
                    int teacherId;
                    try
                    {   
                        //parsing teacher ID from text fields
                        int parsedteacherID = Integer.parseInt(t13.getText());
                        
                        
                        teacherId = parsedteacherID;
                    }
                    catch (NumberFormatException ex) //handling invalid input for teacher ID
                    {
                        JOptionPane.showMessageDialog(b2, "Invalid input for Teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    
                    int newPerformanceIndex;
                    try
                    {
                        newPerformanceIndex = Integer.parseInt(t12.getText());  // Parsing new performance index from text field
                           
                        if(newPerformanceIndex < 5 )   // Checking if performance index is less than 5
                        {
                            JOptionPane.showMessageDialog(b2, "performanceIndex should be greater than or equal to 5.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                    catch (NumberFormatException ex) // Handling invalid input for Performance Index
                    {
                            JOptionPane.showMessageDialog(b2, "Invalid input for Performance Index.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                    }
                    
                    double newSalary;
                    try
                    {
                        double parsednewSalary = Double.parseDouble(t11.getText());  // Parsing new salary from text field
                                
                        
                        
                        newSalary = parsednewSalary;
                    }
                    catch (NumberFormatException ex) //handling invalid input for salary
                    {
                            JOptionPane.showMessageDialog(b2, "Invalid input for Salary.", "Error", JOptionPane.ERROR_MESSAGE);
                            return; 
                    }
                    Teacher te = null;
                    for(Teacher t : tlist)  //looping through the list of teachers
                    {
                            if (t.getTeacherId()==teacherId) //finding the teacher ID with matching ID
                            {
                                te = t;
                                break;
                            }    
                    }
                    if(te == null) //handling i teacher ID is not found
                    {
                        JOptionPane.showMessageDialog(b2, "Teacher ID is not found.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (!(te instanceof Tutor)) // Checking if the teacher is an instance of Tutor
                    {
                        JOptionPane.showMessageDialog(b2, "This is not a Tutor.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    Tutor tutor = (Tutor) te;//downcasting the teacher object to Tutor
                    
                    int workingHours = tutor.getWorkingHours();
                    
                    if(workingHours > 20) // Checking if working hours is greater than 20
                    {
                        tutor.setSalaryAndCertify(newSalary, newPerformanceIndex);  // Setting salary and certifying the tutor
                            
                        if (tutor.getIsCertified())
                        {
                            // Printing the updated salary and performance index to console
                            System.out.println("New Salary: $" + tutor.getSalary());
                            System.out.println("New Performance Index: " + tutor.getPerformanceIndex());
                            
                        }
                    }
                    else
                    {
                        System.out.println("Salary cannot be approved because the tutor is not certified yet."); //salary cannot be approved due to certification status
                    }
                    
                    JOptionPane.showMessageDialog(b2, "Salary and Performance Index updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE); //salary and performance index are updated
                }
            }
        });
        
    
        JButton b3 = new JButton("Remove Tutor"); //creating a button for removing tutor
        b3.setBounds(638, 720, 170, 50);
        jf.add(b3);
        b3.addActionListener(new ActionListener() //actionlistener for b3
        {
            public void actionPerformed(ActionEvent ae) {
                if (t14.getText().isEmpty())
                {
                        JOptionPane.showMessageDialog(b3, "Please enter Teacher ID to remove.", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                }
                else 
                {
                  int teacherId ;
                  try
                  {
                        // Parsing Teacher ID from the text field
                        int parsedteacherID = Integer.parseInt(t14.getText());
                        
                        
                        
                        teacherId = parsedteacherID;
                  }
                  catch (NumberFormatException ex)
                  {
                        JOptionPane.showMessageDialog(b3, "Invalid input for Teacher ID.", "Error", JOptionPane.ERROR_MESSAGE); // Handling invalid input for Teacher ID
                        return;
                  }
                  
                  Teacher te = null;
                  for(Teacher t : tlist)  // Looping through the list of teachers to find the tutor with the given ID
                  {
                        if (t.getTeacherId()==teacherId && t instanceof Tutor) // Checking if the teacher ID matches and if the teacher is an instance of Tutor
                        {
                            te = t;
                            break;
                        }    
                  }
                  if(te == null)  // Handling if tutor with given ID is not found or if it's not a Tutor instance
                  {
                    JOptionPane.showMessageDialog(b3, "Teacher ID is not found or does not belong to a Tutor.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                  }
                  
                  Tutor tutor = (Tutor) te;//downcasting the teacher object to tutor
                  
                  
                  if(tutor.getIsCertified()) // Checking if the tutor is certified
                  {
                      tutor.removeTutor();//calls the method removeTutor
                        
                        
                      JOptionPane.showMessageDialog(b3, "TutorRemoved Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE); 
                      
                
                      // The following attributes will be reset after removal
                      System.out.println("Salary: " + tutor.getSalary());
                      System.out.println("Specialization: " + tutor.getSpecialization());
                      System.out.println("Academic Qualifications: " + tutor.getAcademicQualifications());
                      System.out.println("Performance Index: " + tutor.getPerformanceIndex());
                      
                      // Displaying updated information in console
                      System.out.println("Tutor Removed Successfully!");
                  }
                  else
                  {
                     JOptionPane.showMessageDialog(b3, "Tutor cannot be removed because tutor is not certified yet.", "Error", JOptionPane.ERROR_MESSAGE);   
                  }
                } 
            }
        });
        
        
        
        JButton b4 = new JButton("Display"); // creating a button for displaying tutor's information
        b4.setBounds(638, 290, 170, 50);
        jf.add(b4);
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {           
                      if
                      (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() || t5.getText().isEmpty() || t6.getText().isEmpty() || 
                      t7.getText().isEmpty() || t8.getText().isEmpty() || t9.getText().isEmpty() || t10.getText().isEmpty() || t11.getText().isEmpty() || t12.getText().isEmpty() ||
                      t13.getText().isEmpty() || t14.getText().isEmpty())
                      {
                         JOptionPane.showMessageDialog(b4,"Kindly fill all the required fields");
                         return;
                      }
                      for
                      (Teacher t:tlist)
                      {
                        if(t instanceof Tutor)
                        {
                            t.display();
                        }
                      }
                      JOptionPane.showMessageDialog(null, "Tutor's list is displayed successfully in the console.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
        });
        
        
        
        JButton b5 = new JButton("Clear"); //creating JButton for clearing the fields
        b5.setBounds(638, 360, 170, 50);
        b5.addActionListener(new ActionListener() // adding actionListener to define what happens when button is clicked
        {
            public void actionPerformed(ActionEvent ae) //action to be performed when the button is clicked
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                t9.setText("");
                t10.setText("");
                t11.setText("");
                t12.setText("");
                t13.setText("");
                t14.setText("");
                JOptionPane.showMessageDialog(null,"The required fields are cleared!");
            } 
        });
        
        jf.add(b5);
        
        
         
        
        
        
        JButton b6 = new JButton("Go To Lecturer ");
        b6.setBounds(1260, 720, 200, 50);
        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jf.dispose(); //disposes of the current frame
                
                LecturerGUI(); // calls a method LectureGUI to switch to another GUI
            }
        });
        jf.add(b6);
        
        jf.setVisible(true); //making the frame visible
        
        Font headingFont2 = new Font("Times New Roman", Font.PLAIN, 21);
        
        // setting font and background color for all buttons of tutorGUI
        b1.setFont(headingFont2);
        b1.setForeground(new Color(26, 36, 33));
        b1.setBackground(new Color(196,177,255));
        b2.setFont(headingFont2); 
        b2.setForeground(new Color(26, 36, 33));
        b2.setBackground(new Color(196,177,255));
        b3.setFont(headingFont2);
        b3.setForeground(new Color(26, 36, 33));
        b3.setBackground(new Color(196,177,255));
        b4.setFont(headingFont2);
        b4.setForeground(new Color(26, 36, 33));
        b4.setBackground(new Color(196,177,255));
       
        b5.setFont(headingFont2);
        b5.setForeground(new Color(26, 36, 33));
        b5.setBackground(new Color(196,177,255));
        
        
        b6.setFont(headingFont2);
        b6.setForeground(new Color(26, 36, 33));
        b6.setBackground(new Color(196,177,255));
        
        
        JPanel panel1 = new JPanel(); //Creating a JPanel
        panel1.setBounds(60, 26, 1416, 753);
        panel1.setBackground(new Color(116,92,151));
        jf.add(panel1); //adding panel to the frame
    }
    public TeacherGUI() //constructor of TeacherGUI class
    {
        tlist = new ArrayList<>();
        landing_frame(); //Calling the landing_frame() method to create the initial frame
    }
    public static void main(String[]args) // main method to execute the program
    {
        new TeacherGUI(); // creating and instance of TeacherGUI
    }
}
