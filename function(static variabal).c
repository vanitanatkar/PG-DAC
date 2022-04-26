void f1();
static int x=0;

void f1()
{
static int x=0; //static local variable
x++;
printf("%d\n",x);
}
main()
{
int i;
for(i=1;i<=5;i++)
f1();}
