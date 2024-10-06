class soPhuc{
    private int a,b;
    public soPhuc(){
        a=0;
        b=0;
    }
    public soPhuc(int a,int b){
        this.a=a;
        this.b=b;
    }
    public soPhuc cong(soPhuc sp2){
        int thuc=a+sp2.a;
        int ao=b+sp2.b;
        return new soPhuc(thuc,ao);
    }
    public soPhuc nhan(soPhuc sp2){
        int thuc=a*sp2.a-b*sp2.b;
        int ao=a*sp2.b+sp2.a*b;
        return new soPhuc(thuc,ao);
    }
    @Override
    public String toString(){
        return a + " + " +b + 'i';
    }
}