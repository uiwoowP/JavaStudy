package pjc;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;
import javax.swing.border.Border;

public class CreateTextField {
    public static JTextField textField(int x, int y, String label) {
        return new CustomTextField(x, y, label);
    }
    
    public static JTextField halfTextField(int x, int y, String label) {
    	return new HalfTextField(x, y, label);
    }
    
}

class CustomTextField extends JTextField {
    private String label;
    private boolean isShowingLabel;

    public CustomTextField(int x, int y, String label) {
        this.label = label;
        this.isShowingLabel = true;
        setSize(375, 50);
        setFont(new Font("나눔글꼴", Font.PLAIN, 14));
        setForeground(Color.GRAY);
        setLocation(x, y);
        setText(label);

        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (isShowingLabel) {
                    setText("");
                    setForeground(Color.BLACK);
                    isShowingLabel = false;
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (getText().isEmpty()) {
                    setForeground(Color.GRAY);
                    setText(label);
                    isShowingLabel = true;
                }
            }
        });
        
        setBorder(new Border() {
			private int radius = 10;

			@Override
			public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
				g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
			}

			@Override
			public Insets getBorderInsets(Component c) {
				return new Insets(radius + 1, radius + 1, radius + 2, radius);
			}

			@Override
			public boolean isBorderOpaque() {
				return true;
			}
		});
    }

    @Override
    public String getText() {
        return isShowingLabel ? "" : super.getText();
    }
}

class HalfTextField extends JTextField {
    private String label;
    private boolean isShowingLabel;
    private static final int RADIUS = 15;

    public HalfTextField(int x, int y, String label) {
        this.label = label;
        this.isShowingLabel = true;
        setSize(180, 50);
        setFont(new Font("나눔글꼴", Font.PLAIN, 14));
        setBorder(new RoundBorder(RADIUS, getForeground()));
        setForeground(Color.GRAY);
        setLocation(x, y);
        setText(label);

        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (isShowingLabel) {
                    setText("");
                    setForeground(Color.BLACK);
                    isShowingLabel = false;
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (getText().isEmpty()) {
                    setForeground(Color.GRAY);
                    setText(label);
                    isShowingLabel = true;
                }
            }
        });
        
    }

    @Override
    public String getText() {
        return isShowingLabel ? "" : super.getText();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
    	
    	if (!isOpaque()) {
    		Graphics2D g2 = (Graphics2D) g.create();
    		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    		g2.setColor(getBackground());
    		g2.fillRoundRect(0,  0,  getWidth() -1,  getHeight() - 1, RADIUS, RADIUS);
    		g2.dispose();
    	}
    	super.paintComponent(g);
    }
    
}

class RoundBorder implements Border {
	private int radius;
	private Color color;
	
	public RoundBorder(int radius, Color color) {
		this.radius = radius;
		this.color = color;
	}
	
	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		Graphics2D g2 = (Graphics2D) g.create();
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(color);
		g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
		g2.dispose();
		
	}
	
	@Override
	public Insets getBorderInsets(Component c) {
		return new Insets(radius / 2, radius / 2, radius / 2, radius / 2);
	}
	
	@Override
	public boolean isBorderOpaque() {
		return false;
	}
	
}
