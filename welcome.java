import java.awt.*;
import java.applet.*;
import java.awt.Color;
public class welcome extends Applet
{
public void init()
{
setBackground(Color.YELLOW);
}
public void paint(Graphics g)
{
g.drawLine(10,50,100,150);
g.setColor(Color.red);
g.drawString("good morning",10,50);
}
}
/*<html>
<body bgcolor="blue">
<applet 
code="welcome.class"
          height=200
          width=300>
</applet>
</body>
</html>*/