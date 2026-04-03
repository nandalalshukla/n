class Solution {

    public String encode(List<String> strs) {
        String es= "";
         for(String s: strs){
            es+= s.length()+"#"+s;
         }
         return es;
    }

    public List<String> decode(String str) {
         List<String> res= new ArrayList<>();
         int i=0;
         while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#') j++;
            int l= Integer.parseInt(str.substring(i,j));
            j++;
            res.add(str.substring(j,j+l));
            i=j+l;
         }
         return res;
         
    }
}
