//Unwinnable TicTacToe Game
//Created By Om Rawal
//started on 02/01/2020 09:47
//# completed on 02/01/2020 11:11


import java.util.*;
class tictactoec
{
	  public static int b=1;
    public static void main(String[] args) {
		System.out.println("\t\t\t\tWelcome to Tic-Tac-Toe");
		int a[][]=new int[3][3];	
    System.out.println("The basic structure is");
    System.out.println("\t\t\t\t1 2 3");
    System.out.println("\t\t\t\t4 5 6");
    System.out.println("\t\t\t\t7 8 9");
    Random rand = new Random();
    int n = rand.nextInt(9);
    {
      if(n%2==0)
      {
        b=1;
      }
      else
      b=-1;
    }
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
      System.out.println("\t\t\tPlayer Wins!!! \n\t\t\tGAME OVER");
    }
    else
    {
      print(a);
      System.out.println("\t\t\tComputer Wins!!! \n\t\t\tGAME OVER");
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
  public static void p(int a[][],int d)
  {
    int c;
    if(d==1)
    {
      System.out.print("Player : ");
      Scanner sc=new Scanner (System.in);
      c=sc.nextInt();
    }
    else
    {
      System.out.print("Computer: ");
      c=force(a);
    }
    switch(c)
    {
      case 1:
        if(a[0][0]!=0)
      {
        {
      b*=-1;}  
      }
      else
        a[0][0]=d;
      break;
      case 2:
        if(a[0][1]!=0)
      {
        {
      b*=-1;}  
      }
      else
        a[0][1]=d;
      break;
      case 3:
        if(a[0][2]!=0)
      {
        {
      b*=-1;}  
      }
      else
        a[0][2]=d;
      break;
      case 4:
        if(a[1][0]!=0)
      {
        {
      b*=-1;}  
      }
      else
        a[1][0]=d;
      break;
      case 5:
        if(a[1][1]!=0)
      {
        {
      b*=-1;}  
      }
      else
        a[1][1]=d;
      break;
      case 6:
        if(a[1][2]!=0)
      {
        {
      b*=-1;}  
      }
      else
        a[1][2]=d;
      break;
      case 7:
        if(a[2][0]!=0)
      {
        {
      b*=-1;}  
      }
      else
        a[2][0]=d;
      break;
      case 8:
        if(a[2][1]!=0)
      {
        {
      b*=-1;}  
      }
      else
        a[2][1]=d;
      break;
      case 9:
      if(a[2][2]!=0)
      {
        {
      b*=-1;}  
      }
      else
        a[2][2]=d;
      break;
      default:
      {
      b*=-1;}
      break;
    }
  }
  public static int force(int a[][])
  {
    if(a[0][0]==1&&a[0][1]==1&&a[0][2]==0)
            return(3);
    else if(a[0][1]==1&&a[0][2]==1&&(a[0][0]==0))
            return(1);
    else if(a[1][0]==1&&a[1][1]==1&&(a[1][2]==0))
            return(6);
    else if(a[1][1]==1&&a[1][2]==1&&(a[1][0]==0))
            return(4);
    else if(a[2][0]==1&&a[2][1]==1&&(a[2][2]==0))
            return(9);
    else if(a[2][1]==1&&a[2][2]==1&&(a[2][0]==0))
            return(7);
    //end of row condt
     else if(a[0][0]==1&&a[2][0]==1&&(a[1][0]==0))
            return(4);
    else if(a[2][0]==1&&a[2][2]==1&&(a[2][1]==0))
            return(8);
    else if(a[0][0]==1&&a[0][2]==1&&(a[0][1]==0))
            return(2);
    else if(a[0][2]==1&&a[2][2]==1&&(a[1][2]==0))
            return(6);
    // end of corner condt
    else if(a[0][0]==1&&a[1][1]==1&&(a[2][2]==0))
            return(9);
    else if(a[1][1]==1&&a[0][0]==1&&(a[0][0]==0))
            return(1);
    else if(a[0][2]==1&&a[1][1]==1&&(a[2][0]==0))
            return(7);
    else if(a[1][1]==1&&a[2][0]==1&&(a[0][2]==0))
            return(3);
    //end of diagonal condt
    else if(a[0][0]==1&&a[1][0]==1&&(a[2][0]==0))
            return(7);
    else if(a[1][0]==1&&a[2][0]==1&&(a[0][0]==0))
            return(1);
    else if(a[0][1]==1&&a[1][1]==1&&(a[2][1]==0))
            return(8);
    else if(a[1][1]==1&&a[2][1]==1&&(a[0][1]==0))
            return(2);
    else if(a[0][2]==1&&a[1][2]==1&&(a[2][2]==0))
            return(9);
    else if(a[1][2]==1&&a[2][2]==1&&(a[0][2]==0))
            return(3);
    // end of column condt
   
    else if(a[0][0]==0||a[0][2]==0||a[2][0]==0||a[2][2]==0)
    {
      Random rand = new Random();
        int n = rand.nextInt(9);
        n += 1;
        if(n%2==0)
        {
          n+=1;
        }
        if(n==5)
        {
          n=7;
        }
        return (n);
    }
    
    else if(a[0][0]==1||a[0][2]==1||a[1][0]==1||a[1][2]==1||a[2][0]==1||a[2][2]==1)
    {
      if(a[1][1]==0)
        return(5);
      else
      {
        Random rand = new Random();
        int n = rand.nextInt(9);
        n += 1;
        return (n);  
      }
    }
    
    else
    {
      Random rand = new Random();
      int n = rand.nextInt(9);
      n += 1;
      return (n);
    }
  }

}