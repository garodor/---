//���������� ������� ���������� ���������� ����������� ������, ����������� ��������� � ��������������� ��������� ���������
public class Main {
    public static void main(String[] args) {
        // ������� ����� ��������� ���������
        ProgramState initialState = new ProgramState(0);

        // ����������� ������� �� 1
        initialState.setCounter(initialState.getCounter() + 1);

        // ��������� ��������� ���������
        StateManager.saveState(initialState);

        // ��������������� ��������� ���������
        ProgramState restoredState = StateManager.restoreState();

        // ������� �������� ��������
        System.out.println("�������: " + restoredState.getCounter());
    }
}