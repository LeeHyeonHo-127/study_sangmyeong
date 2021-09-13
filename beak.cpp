#include<stdio.h>
#include<stdlib.h>
#pragma warning(disable: 4996)

int main()
{

	typedef struct block
	{
		int start;
		int stop;
		int runtime;
	}block;


	int end_point, running_temp, count, N,j;
	running_temp = -1;
	end_point = -1;
	count = 0;

	scanf("%d", &N);

	
	block temp;
	block* time = new block[N];




	for (int i = 0; i < N; i++)
	{
		scanf("%d %d", &time[i].start, &time[i].stop);
		time[i].runtime = time[i].stop - time[i].start;
	}


	for (int i = 1; i < N ; i++)
	{
		temp = time[i];
		for (j = i-1; j >= 0 && time[j].start > temp.start; j--)
		{
				time[j + 1] = time[j];		
		}
		time[j+1] = temp;
	}
	

	for (int i = 0; i < N; i++)
	{
		if (time[i].stop <= end_point && running_temp > time[i].runtime)
		{
			
			end_point = time[i].stop;
			running_temp = time[i].runtime;
		}
		else if (end_point <= time[i].start)
		{
			count++;
			end_point = time[i].stop;
			running_temp = time[i].runtime;

		}
		
	}

	printf("%d", count);
	return 0;
}