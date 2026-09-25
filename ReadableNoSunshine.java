class ReadableNoSunshine{
    String s="she's gone",
    i="I know, ",
    n="no sunshine when ",
    h="And this house just ain't no home\n",
    t="Anytime she goes away\n",
    y="Ain't ",
    d="And ",
    w="Wonder ",
    l="\n",
    a=y+n+s;
    void p(String...s){
        for(var x:s)System.out.println(x);
    }
    String m(String s,int m){
        return s.repeat(m);
    }
    void main(String[]z){
        p(a,
        "It's not warm when she's away",
        a,
        d+"she's always gone too long",
        t,
        w+"this time where "+s,
        w+"if "+s+" to stay",
        a,
        h+t,
        d+m(m(i,5)+l,5)+i+i+l,
        "Hey, I ought to leave young thing alone\nBut "+a+", whoa-whoa",
        a,
        "Only darkness every day\n",
        a,
        h,
        m(t,4));
    }
}