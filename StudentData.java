class StudentData{
/*
    Write a java program to create class student having instance variables Name,Rollno,Marks, respectively
    write methods to calculate grade of students create five objects by array of objects .
*/
    public static void main(String args[])
    {
        
        StudentResult arr[] = new StudentResult[5];
        for (int var : arr) {
            arr[var] = new Student();            
        }
        

    }

}