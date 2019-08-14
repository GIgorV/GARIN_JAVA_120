package ru.itis.repositories;

import java.io.*;

// �����, ������������ ��������������
// �������������, ��� ��� ��������������� �������������� ����� �����������
// ������ ��� ������� ��������� �������� ����� �������, ���
// ������� �� ����� ��������� ��������������� id � � ���� ������������ 1
// ����� ���� id ����� ������������ � ����
public class IdGenerator {
    // ����, ������ ������ �������� �����
    // � ������� ��������� ��������� ��������������� id
    private String fileName;

    public IdGenerator(String fileName) {
        this.fileName = fileName;
    }
    // �������, ������������ ����� �������������
    public int generate() {
        try {
            // ��������� ����� ��������� ��������������� id
            InputStream input = new FileInputStream(fileName);
            // ������� ������ ����, ���� ������� �����, ����������� � �����
            byte bytes[] = new byte[10];
            // ������ ����� ������ �� �����
            input.read(bytes);
            // ����������� ������ ����� � ������
            String idAsString = new String(bytes);
            // ������� ������ �� ������ � ������������ � ����� int
            int lastGeneratedId = Integer.parseInt(idAsString.trim());
            // ����������� ������ ����� �� 1
            lastGeneratedId++;
            // ��������� ���� ��� ������
            input.close();
            // ��������� ���� ��� ������
            OutputStream output = new FileOutputStream(fileName);
            // ����������� ����� � ������
            idAsString = String.valueOf(lastGeneratedId);
            // ������������ ������ � ������ ������ � ���������� � ����
            output.write(idAsString.getBytes());
            // ��������� ����
            output.close();
            // ���������� ��������������� id
            return lastGeneratedId;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}