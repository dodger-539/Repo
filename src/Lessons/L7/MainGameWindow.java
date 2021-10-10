package Lessons.L7;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 04.10.2021
 */

public class MainGameWindow extends JFrame {

    private int windowWidth = 1024;
    private int windowHeight = 768;
    private int windowPositionX = 300;
    private int windowPositionY = 100;

    private Map gameMap;
    private JPanel gui;

    private JPanel gameControlArea;
    private JButton buttonStartGame;
    private JButton buttonExitGame;

    private JPanel gameInfoArea;
    private JLabel gameLevelInfo;
    private JLabel gameMapSizeInfo;
    private JLabel gameEnemyCountInfo;

    private JPanel playerInfoArea;
    private JLabel playerHealthInfo;
    private JLabel playerStrInfo;
    private JLabel playerPositionInfo;

    private JPanel playerControllerArea;
    private JButton playerMoveUp;
    private JButton playerMoveLeft;
    private JButton playerMoveRight;
    private JButton playerMoveDown;

    private JScrollPane scrollPanel;
    private JTextArea gameLog;

    MainGameWindow() {
        setupWindow();
        gameMap = new Map();

        setupGui();

        add(gui, BorderLayout.EAST);
        add(gameMap);


        setVisible(true);


    }

    private void setupGui() {
        gui = new JPanel();
        gui.setLayout(new GridLayout(5, 1));

        setupGameControl();
        setupGameInfo();
        setupPlayerInfo();
        setupPlayerController();
        setupGameLog();

        gui.add(gameControlArea);
        gui.add(gameInfoArea);
//        gui.add(playerInfoArea);
//        gui.add(playerControllerArea);

    }

    private void setupGameControl() {
        gameControlArea = new JPanel();
        gameControlArea.setLayout(new GridLayout(2, 1));

        buttonStartGame = new JButton("Start Game!");
        buttonExitGame = new JButton("Exit Game!");

        gameControlArea.add(buttonStartGame);
        gameControlArea.add(buttonExitGame);

    }

    private void setupGameInfo() {
        gameInfoArea = new JPanel();
        gameInfoArea.setLayout(new GridLayout(3, 1));

        gameLevelInfo = new JLabel("Level: -");
        gameMapSizeInfo = new JLabel("Map Size: -:-");
        gameEnemyCountInfo = new JLabel("Enemies: -");

        gameInfoArea.add(gameLevelInfo);
        gameInfoArea.add(gameMapSizeInfo);
        gameInfoArea.add(gameEnemyCountInfo);

    }

    private void setupPlayerInfo() {

    }

    private void setupPlayerController() {

    }

    private void setupGameLog() {

    }

    private void setupWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(windowPositionX, windowPositionY);
        setSize(windowWidth, windowHeight);
        setTitle("GUI Application");
        setResizable(false);
    }
}
