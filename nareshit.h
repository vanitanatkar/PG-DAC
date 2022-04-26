
int max(int x,int y)
{return x>y ? x : y;
}
int min(int x,int y)
{
return x<y ? x : y;
}
int power(int n,int p)
{
int i,r=1;
for(i=1;i<=p;i++)
r=r*n;
return r;
}
int fact(int n)
{
int i,f=1;
for(i=1;i<=n;i++)
f=f*i;
return f;
}
