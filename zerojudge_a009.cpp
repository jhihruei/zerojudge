#include<iostream>
#include<string>
using namespace std;
string encrypto(string input);	
int main()  //decrypt +7=encrypt
{
	string inPut;
	while(getline(cin,inPut))
	{
		inPut=encrypto(inPut);
		cout<<inPut<<endl;
	}
	return system("Pause");
}

string encrypto(string input)
{
	int length=input.length();
	for(int i=0;i<length;i++)
		input[i]=input[i]-7;
	return input;
}
