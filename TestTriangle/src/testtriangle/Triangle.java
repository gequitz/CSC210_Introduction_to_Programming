/*
 * Triangle class to verify the type of triangle
 */

package testtriangle;

/**
 *
 * @author Gabriel Equitz
 */
public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;
    
    
    // default constructor that has three arguments
    Triangle(int newSideA, int newSideB, int newSideC){
        sideA = newSideA;
        sideB = newSideB;
        sideC = newSideC;
    }
    // default constructor (no argument)
    Triangle(){
      //  this(0, 0, 0) ;
        sideA=0;
        sideB=0;
        sideC=0;
        
    }
    
    // accessor of variable side A
    public int getA(){
        return sideA;
    }
    // accessor of variable side B
    public int getB(){
        return sideB;
    }
    // accessor of variable side C
     public int getC(){
        return sideC;
    }
    //mutator of variable sideA
    public void setA(int newSideA){
        sideA = newSideA;
    }
    //mutator of variable sideB
    public void setB(int newSideB){
        sideB = newSideB;
    }
    //mutator of variable sideC
    public void setC(int newSideC){
        sideC = newSideC;
    }
   
    //A valid triangle has (sideA + sideB < sideC, etc)
    public boolean isValid(){
        if ( sideA <= 0 || sideB <= 0 || sideC <= 0)
            return false;
        else if (((sideA + sideB) == sideC) || ((sideA + sideC) == sideB) || ((sideB + sideC) == sideA) )
            return false;
        else
            return true;
    }
    //A scalene triangle has all unequal sides
    public boolean isScalene(){
        
       /* if ((sideA != sideB) && (sideA != sideC) && (sideB != sideC) )
            return true;
        else
            return false; */
        return ((sideA != sideB) && (sideA != sideC) && (sideB != sideC) );
    }
    //A right triangle satisfy the Pythagorean theorem
    public boolean isRight(){
        if (( sideA*sideA == sideB*sideB + sideC*sideC ) ||            
        (sideB*sideB == sideA*sideA + sideC*sideC) ||         
        (sideC*sideC == sideA*sideA + sideB*sideB))
            return true;
        else
            return false;
                    
    }
    // An Isosceles triangle has two equal sides
    public boolean isIsosceles(){
        if (((sideA == sideB) && (sideA != sideC) )||
                 ((sideB == sideC) && (sideB != sideA)) ||
                 ((sideA == sideC) && (sideA != sideB)) )
            return true;
        else
            return false;
    }
    // An Equilateral triangle has all equal sides
    public boolean isEquilateral(){
        if ((sideA == sideB) && (sideA == sideC)  )
            return true;
        else
            return false;
    }
}
