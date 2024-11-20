#include <bits/stdc++.h>
using namespace std;

#define deb(x) cout<<#x<<" "<<x<<endl;
#define fo(i,n) for(int i=0;i<n;i++)
#define Fo(i,k,n) for(int i=k;i<n;i++)
#define N 101
#define ll long long
#define endl "\n"
#define mod 1000000007
#define pb push_back
#define F first
#define S second
#define mp make_pair
#define lb lower_bound
#define ub upper_bound
#define all(x) x.begin(), x.end()
typedef vector<int> vi;

int main() {
    ios_base::sync_with_stdio(false);
    
    int T;
    cin>>T;
    while(T--) {
        int n,k;
        string a,b;
        cin>>n>>k>>a>>b;
        vector<int> ac(26,0),bc(26,0);
        for(int i=0;i<n;i++) {
            ac[a[i]-'a']++;
            bc[b[i]-'a']++;
        }

        bool flag = true;
        for(int i=0;i<=25;i++) {
            if(ac[i]<bc[i]) {
                flag=false;
                break;
            }

            int diff= ac[i] - bc[i];
            if(diff%k) {
                flag=false;
                break;
            }
            ac[i]-=diff;
            ac[i+1]+=diff;
        }
        if(flag)
            cout<<"Yes"<<endl;
        else
            cout<<"No"<<endl;
    }

    return 0;
}