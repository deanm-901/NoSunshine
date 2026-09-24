class ReadableNoSunshine {
    String sg="she's gone",
    iK="I know",
    ik=iK+", ",
    ns="no sunshine",
    hm="And this house just ain't no home",
    at="Anytime she goes away",
    ai="Ain't ",
    an="And ",
    wo="Wonder ",
    a=ai+ns+" when "+sg;
    void p(String...s){
        for(String x:s)System.out.println(x);
    }
    String m(String s,int m){
        return s.repeat(m);
    }
    public void main(String[]z) {
        p(a,
        "It's not warm when she's away",
        a,
        an+"she's always gone too long",
        at+"\n",
        wo+"this time where "+sg,
        wo+"if she's gone to stay",
        a,
        hm,
        at+"\n",
        an+m(ik,3)+iK,
        m(m(ik,4)+iK+"\n",3)+m(ik,4)+iK,
        ik+iK+"\n",
        "Hey, I ought to leave young thing alone",
        "But ain't "+ns+" when "+sg+", whoa-whoa",
        a,
        "Only darkness every day\n",
        a,
        hm+"\n",
        m(at+"\n",4));
    }
}