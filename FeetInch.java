class FeetInch
{
/*
    Write a JAVA Program to create class distance having member variables feet and inch respectivily create 
    a constructor to initialize them and write method to add two different distances.
*/

    public static void main (String args[])
    {
        Distance d1,d2,d3;
        d1 = new Distance(10,20);
        d2 = new Distance(30,40);
        d3 = new Distance();
        d3 = d3.add(d1,d2);
        d3.show();
    }

}