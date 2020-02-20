class Distance{

int feet,inch;

Distance()
{
    this.feet = 0;
    this.inch = 0;
}

Distance(int feet,int inch)
{
    this.feet = feet;
    this.inch = inch;
}
// 1 feet 12 inch
Distance add(Distance dis1, Distance dis2)
{
    int i1,f1;
    Distance dis3 = new Distance();
    i1 = dis1.inch + dis2.inch;
    f1 = dis1.feet + dis2.feet + i1/12;
    dis3.inch = i1 % 12;
    dis3.feet = f1;     
    return dis3; 
}
void show()
{
    System.out.println("Sum is : "+feet+"."+inch);
}








}
