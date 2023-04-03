package s1267;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	static Queue<Integer> Q;
	static Queue<Integer> A;
	static int[][] adj;
	static int[] in_degree;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�׽�Ʈ ���̽��� 10���� ����
		int T = 10;
		
		for(int tc = 1; tc <= T; tc++) {
			
			//���� ���� ���� ���� �Է¹���
			int V = sc.nextInt();
			int E = sc.nextInt();
			
			//�������: ���� �� + 1��ŭ �ε����� �־� 1������ V������ �� �� �ֵ��� ��
			adj = new int[V+1][V+1];
			//��ü ������ �������� ������ �迭
			in_degree = new int[V+1];
			
			//���� �Է�: out - in ������ �Է¹���
			//���������� ���� �Է¹���
			for(int i=0; i<E; i++) {
				int outd = sc.nextInt();
				int ind = sc.nextInt();
				adj[outd][ind] = 1;
				in_degree[ind] += 1;
			}

			//���������� ���� ť Q, ���� ����� ���� ť A
			Q = new LinkedList<>();
			A = new LinkedList<>();
			
			//���������� 0�� ������ ť�� ���� �߰�
			for(int i=1; i<V+1; i++) {
				if(in_degree[i] == 0) Q.add(i);
			}
			
			//ť�� �� ������, ť���� ������ �ϳ��� ���鼭 �� ������ ���� ť�� �߰�
			//�ش� ������ ���������� ���Ǹ鼭 ���� �����ϴ� ������ �ִٸ�
			//�ش� ���� ����(������������ �ش� �ε����� �ش��ϴ� �� -1)
			//���� ������ �����ߴµ� ���������� 0�� �ȴٸ� ������ ���̹Ƿ�, ť�� ���� �߰�
			while(!Q.isEmpty()) {
				int cur = Q.poll();
				A.add(cur);
				for(int i=1; i<adj[cur].length; i++) { //��������
					if(adj[cur][i] == 0) continue;
					in_degree[i] -= 1; //�ش� �ε����� �����ϴ� �� ������ ���� ����
					if(in_degree[i] == 0) Q.add(i);
				}
			}
			//���� ���
			System.out.print("#"+tc);
			while(!A.isEmpty()) System.out.print(" "+(A.poll()));
			System.out.println();
		}
	}
}
