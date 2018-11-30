/**
 * 有效的数独
 * @author VirtualChen 
 *
 */
public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		if(isChunkValidSudo(board)==1&&isLineValidSudo(board)==1&&isRowValidSudo(board)==1)
		{
			return true;
		}
		else
		{
			return false;
		}
    }
	public int isLineValidSudo(char[][] board) {
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				for(int k=0;k<9;k++)
				{
					if(k!=j&&board[i][k]==board[i][j]&&board[i][j]!='.')
					{
						return 0;
					}
				}
			}
		}
		return 1;
	}
	public int isRowValidSudo(char[][] board) {
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				for(int k=0;k<9;k++)
				{
					if(k!=j&&board[k][i]==board[j][i]&&board[j][i]!='.')
					{
						return 0;
					}
				}
			}
		}
		return 1;
	}
	public int isChunkValidSudo(char[][] board) {
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					for(int m=0;m<3;m++)
					{
						if((k!=i||m!=j)&&board[i][j]==board[k][m]&&board[i][j]!='.')
						{
							return 0;
						}
					}
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=3;j<6;j++)
			{
				for(int k=0;k<3;k++)
				{
					for(int m=3;m<6;m++)
					{
						if((k!=i||m!=j)&&board[i][j]==board[k][m]&&board[i][j]!='.')
						{
							return 0;
						}
					}
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=6;j<9;j++)
			{
				for(int k=0;k<3;k++)
				{
					for(int m=6;m<9;m++)
					{
						if((k!=i||m!=j)&&board[i][j]==board[k][m]&&board[i][j]!='.')
						{
							return 0;
						}
					}
				}
			}
		}
		
		for(int i=3;i<6;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=3;k<6;k++)
				{
					for(int m=0;m<3;m++)
					{
						if((k!=i||m!=j)&&board[i][j]==board[k][m]&&board[i][j]!='.')
						{
							return 0;
						}
					}
				}
			}
		}
		for(int i=3;i<6;i++)
		{
			for(int j=3;j<6;j++)
			{
				for(int k=3;k<6;k++)
				{
					for(int m=3;m<6;m++)
					{
						if((k!=i||m!=j)&&board[i][j]==board[k][m]&&board[i][j]!='.')
						{
							return 0;
						}
					}
				}
			}
		}
		for(int i=3;i<6;i++)
		{
			for(int j=6;j<9;j++)
			{
				for(int k=3;k<6;k++)
				{
					for(int m=6;m<9;m++)
					{
						if((k!=i||m!=j)&&board[i][j]==board[k][m]&&board[i][j]!='.')
						{
							return 0;
						}
					}
				}
			}
		}
		
		for(int i=6;i<9;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=6;k<9;k++)
				{
					for(int m=0;m<3;m++)
					{
						if((k!=i||m!=j)&&board[i][j]==board[k][m]&&board[i][j]!='.')
						{
							return 0;
						}
					}
				}
			}
		}
		for(int i=6;i<9;i++)
		{
			for(int j=3;j<6;j++)
			{
				for(int k=6;k<9;k++)
				{
					for(int m=3;m<6;m++)
					{
						if((k!=i||m!=j)&&board[i][j]==board[k][m]&&board[i][j]!='.')
						{
							return 0;
						}
					}
				}
			}
		}
		for(int i=6;i<9;i++)
		{
			for(int j=6;j<9;j++)
			{
				for(int k=6;k<9;k++)
				{
					for(int m=6;m<9;m++)
					{
						if((k!=i||m!=j)&&board[i][j]==board[k][m]&&board[i][j]!='.')
						{
							return 0;
						}
					}
				}
			}
		}
		return 1;
	}
}
