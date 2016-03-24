// Lab15st.java
// This is the student, starting file for Lab 15.
// This file is identical to Java1521.java.
// This slide show is about Mr. Leon Schram.
// Each student needs to alter this presentation,
// add pictures, add pages, add graphics and make it about him/herself.


import java.awt.*;


public class Lab15st extends java.applet.Applet
{

	int numClicks;
	Image picture1, picture2, picture3, picture4, picture5, picture6,picture7;

	public void init()
	{
		numClicks = 0;
		picture1 = getImage(getDocumentBase(),"Me.jpg");
		picture2 = getImage(getDocumentBase(),"imgres.jpg");
		picture3 = getImage(getDocumentBase(),"Dog.JPG");
		picture4 = getImage(getDocumentBase(),"NJstate.jpg");
		picture5 = getImage(getDocumentBase(),"TENNIS.jpg");
		picture6 = getImage(getDocumentBase(),"Dragon1.jpg");
		picture7 = getImage(getDocumentBase(),"Skyrim.jpg");


		

		// The following MediaTracker/try/catch code ensures that
		// all images are loaded before the program continues.
		MediaTracker tracker = new MediaTracker(this);
		tracker.addImage(picture1,1);
		tracker.addImage(picture2,1);
		tracker.addImage(picture3,1);
		tracker.addImage(picture4,1);
		tracker.addImage(picture5,1);
		try
		{
			tracker.waitForAll();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public void paint(Graphics g)
	{
		switch (numClicks)
		{
			case 0 : page1(g); break;
			case 1 : page2(g); break;
			case 2 : page3(g); break;
			case 3 : page4(g); break;
		}
	}

	public boolean mouseDown(Event e, int x, int y)
	{
		numClicks++;
		repaint();
		return true;
	}

	public void page1(Graphics g)
	{
		Expo.setBackground(g, Expo.darkerBlue);
		Expo.setFont(g,"Arial",Font.BOLD,100);
		Expo.drawString(g,"TITLE PAGE",218,100);
		Expo.setColor(g,Expo.gold);
		Expo.drawThickPreciseSpiral(g,510,370,275,50,15);
		Expo.setColor(g,Expo.silver);
		Expo.fillStar(g,510,370,175,8);
		Expo.setColor(g,Expo.black);
		Expo.drawThickStar(g,510,370,225,8,25);
		Expo.setColor(g,Expo.blue);
		Expo.drawThickStar(g,510,370,275,8,25);
		g.drawImage(picture1,425,285,150,140,this);
		Expo.setColor(g,Expo.lightBlue);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"My name is Nathan Nunez.",30,300);
		Expo.drawString(g,"Click once to see more awesomeness.",760,550);
	}

	public void page2(Graphics g)
	{
		Expo.setBackground(g,Expo.lighterCyan);
		Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"Family",450,100);
		Expo.setColor(g,Expo.blue);
		Expo.fillRectangle(g,100,250,900,500);// Back for NJ pic
		Expo.fillRectangle(g,100,520,375,820);// Back for Dog pic
		Expo.setColor(g,Expo.chartreuse);
		g.drawImage(picture3,150,550,175,250,this);//Dog
		g.drawImage(picture4,600,260,this);//NJ
		Expo.setColor(g,Expo.blue);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I was born in the United States, Paterson,NJ.",100,200);
		Expo.drawString(g,"I have three bothers, one younger and two older",100,225);
		Expo.drawString(g,"And one Dog, a Beagle and Pointer mix",100,250);
		Expo.drawString(g,"Click once to continue.",750,550);
	}

	public void page3(Graphics g)
	{
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.setFont(g,"Impact",Font.ITALIC,100);
		Expo.drawString(g,"Likes",450,100);
		Expo.setColor(g,Expo.amber);
		Expo.fillRoundedRectangle(g,460,225,700,515,50);// Skyrim
		Expo.fillRoundedRectangle(g,80,525,425,800,50);// Dragon
		g.drawImage(picture7,475,245,200,250,this);
		g.drawImage(picture6,100,550,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I enjoy sci-fi movies and books.",100,150);
		Expo.drawString(g,"Also like RPG games that are based in a fantasy world.",100,175);
		Expo.drawString(g,"Click once to continue.",750,550);
	}
	public void page4(Graphics g)
	{
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.setFont(g,"Impact",Font.ITALIC,100);
		Expo.drawString(g,"High School",400,100);
		Expo.setColor(g,Expo.gold);
		Expo.fillRoundedRectangle(g,460,170,810,400,50);
		g.drawImage(picture2,500,195,this);
		g.drawImage(picture5,100,400,this);
		Expo.setColor(g,Expo.black);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I attend the Vernon Township Highschool.",100,150);
		Expo.drawString(g,"Will be graduting on 2017.",100,175);
		Expo.drawString(g,"Part of the Vernon Tennis team.",100,380);
		Expo.drawString(g,"Click once to continue.",750,550);
	}
}

