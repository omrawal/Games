
// TicTacToe Game 2 player
// Created By Om Rawal
//started on 01/01/2020 20:47
// completed on 01/01/2020 21:36

import java.util.*;

class Main
{
	  public static int b=1;
    public static void main(String[] args) {
		System.out.println("\t\t\t\tWelcome to Tic-Tac-Toe");
		int a[][]=new int[3][3];	
    System.out.println("The basic structure is");
    System.out.println("\t\t\t\t1 2 3");
    System.out.println("\t\t\t\t4 5 6");
    System.out.println("\t\t\t\t7 8 9");
    
    while(checkdraw(a)!=1 && checkwin(a)==0)
    {
      print(a);
      if(b==1)
      {
        p(a,1);
        b*=-1;
      }
      else
      {
        p(a,2);
        b*=-1;
      }
      
    }
    if(checkdraw(a)==1&&checkwin(a)==0)
    {
      print(a);
      System.out.println("\t\t\tGAME DRAW \n\t\t\tGAME OVER");
    }
    else if(checkwin(a)==1)
    {
      print(a);
      System.out.println("\t\t\tPlayer 1 Wins!!! \n\t\t\tGAME OVER");
    }
    else
    {
      print(a);
      System.out.println("\t\t\tPlayer 2 Wins!!! \n\t\t\tGAME OVER");
    }

  }
  public static void print(int a[][])
    {
      System.out.println("\t\t\t\tThe board is:");
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          if(j==0)
          System.out.print("\t\t\t\t"+a[i][j]+" ");
          else
          System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }
    }
// Checking for win return the winner player number
  public static int checkwin(int a[][])
  {
    if(a[0][0]==a[1][1]&&a[2][2]==a[1][1]&&a[0][0]!=0)
      return(a[0][0]);//diagonal primary
    else if(a[0][2]==a[1][1]&&a[2][0]==a[0][2]&&a[0][2]!=0)
      return(a[0][2]);//diagonal secondary
    else if(a[0][0]==a[0][1]&&a[0][0]==a[0][2]&&a[0][2]!=0)
      return(a[0][0]);//row 1
    else if(a[1][0]==a[1][1]&&a[1][0]==a[1][2]&&a[1][2]!=0)
      return(a[1][0]);//row 2
    else if(a[2][0]==a[2][1]&&a[2][0]==a[2][2]&&a[2][2]!=0)
      return(a[2][0]);//row 3
    else if(a[0][0]==a[1][0]&&a[0][0]==a[2][0]&&a[0][0]!=0)
      return(a[0][0]);//column 1
    else if(a[0][1]==a[1][1]&&a[0][1]==a[2][1]&&a[0][1]!=0)
      return(a[0][1]);//column 2
    else if(a[0][2]==a[1][2]&&a[0][2]==a[2][2]&&a[0][2]!=0)
      return(a[0][1]);//column 3
    else
    return (0);
  }
// check for draw if all 9 spaces are filled and no winner is found
  public static int checkdraw(int a[][])
  {
    for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          if(a[i][j]==0)
          return(0);
        }
      }
      return(1);
  }
// play function to select a position for a player
  public static void p(int a[][],int d)
  {
    if(d==1)
    System.out.print("Player 1: ");
    else
    System.out.print("Player 2: ");
    Scanner sc=new Scanner (System.in);
    int c=sc.nextInt();
    switch(c)
    {
      case 1:
        if(a[0][0]!=0)
      {
        {System.out.print("Invalid Input");
      b*=-1;}  
      }
      else
        a[0][0]=d;
      break;
      case 2:
        if(a[0][1]!=0)
      {
        {System.out.print("Invalid Input");
      b*=-1;}  
      }
      else
        a[0][1]=d;
      break;
      case 3:
        if(a[0][2]!=0)
      {
        {System.out.print("Invalid Input");
      b*=-1;}  
      }
      else
        a[0][2]=d;
      break;
      case 4:
        if(a[1][0]!=0)
      {
        {System.out.print("Invalid Input");
      b*=-1;}  
      }
      else
        a[1][0]=d;
      break;
      case 5:
        if(a[1][1]!=0)
      {
        {System.out.print("Invalid Input");
      b*=-1;}  
      }
      else
        a[1][1]=d;
      break;
      case 6:
        if(a[1][2]!=0)
      {
        {System.out.print("Invalid Input");
      b*=-1;}  
      }
      else
        a[1][2]=d;
      break;
      case 7:
        if(a[2][0]!=0)
      {
        {System.out.print("Invalid Input");
      b*=-1;}  
      }
      else
        a[2][0]=d;
      break;
      case 8:
        if(a[2][1]!=0)
      {
        {System.out.print("Invalid Input");
      b*=-1;}  
      }
      else
        a[2][1]=d;
      break;
      case 9:
      if(a[2][2]!=0)
      {
        {System.out.print("Invalid Input");
      b*=-1;}  
      }
      else
        a[2][2]=d;
      break;
      default:
      {System.out.print("Invalid Input");
      b*=-1;}
      break;
    }
  }


}
