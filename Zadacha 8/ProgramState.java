import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// �����, �������������� ��������� ���������
public class ProgramState implements Serializable {
    private static final long serialVersionUID = 1L;
    private int counter;

    public ProgramState(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}

// �����, ���������� �� ���������� ���������� ���������
class StateManager {
    private static final String SAVE_FILE = "program_state.ser";

    // ����� ��� ���������� ��������� ���������
    public static void saveState(ProgramState state) {
        try {
            FileOutputStream fileOut = new FileOutputStream(SAVE_FILE);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(state);
            out.close();
            fileOut.close();
            System.out.println("��������� ��������� ��������� � ����� " + SAVE_FILE);
        } catch (Exception e) {
            System.out.println("������ ��� ���������� ��������� ���������: " + e.getMessage());
        }
    }

    // ����� ��� �������������� ��������� ���������
    public static ProgramState restoreState() {
        ProgramState state = null;
        try {
            FileInputStream fileIn = new FileInputStream(SAVE_FILE);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            state = (ProgramState) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("��������� ��������� ������������� �� ����� " + SAVE_FILE);
        } catch (Exception e) {
            System.out.println("������ ��� �������������� ��������� ���������: " + e.getMessage());
        }
        return state;
    }
}