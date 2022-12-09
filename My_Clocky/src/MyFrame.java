/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
/**
 *
 * @author coora
 */
public class MyFrame extends JFrame {
    
    Calendar calendar;
    
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    
    String time;
    String day;
    String date;
    
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clocky");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(true);
        
        
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
        
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        this.add(timeLabel);
        
        dayFormat = new SimpleDateFormat("EEEE");
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free", Font.PLAIN,35));
        this.add(dayLabel);
        
        dateFormat = new SimpleDateFormat("mm dd, yyyy");
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));
        this.add(dateLabel);
        
        this.setVisible(true);
        
        setTime();
    }
    
    public void setTime(){
        
        while(true){
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        
        day = dayFormat.format(Calendar.getInstance().getTime());
        dayLabel.setText(day);
        
        date = dateFormat.format(Calendar.getInstance().getTime());
        dateLabel.setText(date);
        
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        
        }
    
    }
    
    
}
