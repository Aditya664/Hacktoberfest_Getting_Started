// To find given no. is prime or not //

#include<iostream>
using namespace std;

int main()
{
    int n;
    cout << "\n =======================================\n";

    cout << "\n Enter a Number => ";

    cin >> n;

    for(int i = 2; i<2; i++)
    {
        if( n%i == 0 )
        {
            cout << "\n The Given No. is Not A Prime Number" << endl;
            break;
        }
    }
    cout << "\n The Given No. is A Prime Number" << endl;
    cout << "\n =======================================\n\n";
    return 0;
}