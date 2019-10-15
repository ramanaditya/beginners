//Most efficient way to check whether a number is prime or not
#include <iostream>

#include <cstdlib>

using namespace std;

int main()
{
	int n;
	cout << "Enter the number(n) to be checked\n";
	cin >> n;
	for(int i=2; i * i <= n; i++)
	{
		if(n % i == 0)
		{
			cout << "n is not a Prime number\n";
			exit(0);
		}
	}
	cout << "n is a Prime number\n";
	return 0;
}