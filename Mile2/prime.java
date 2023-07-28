public class prime {
public static void main(String[] args) {
int ar[] = { 10,20,30,40,50,60,70,80,90,100};
System.out.println(findAns(ar));
}
static int findAns(int arr[]){
int ans=arr[0]+arr[1];
for (int i = 2; i < arr.length; i++) {
if (!Prime(i)) {
ans+=arr[i];
}
}
return ans;
}
static Boolean Prime(int a){
for (int i = 2; i < a; i++) {
if(a%i==0){
return false;
}
}
return true; 
}
}