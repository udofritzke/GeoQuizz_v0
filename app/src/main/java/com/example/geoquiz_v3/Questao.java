package com.example.geoquiz_v3;

public class Questao {
    private int mTextoRespostaId;
    private boolean mRespostaCorreta;

    public Questao(int TextoRespostaId, boolean RespostaCorreta) {
        this.mTextoRespostaId = TextoRespostaId;
        this.mRespostaCorreta = RespostaCorreta;
    }

    public int getTextoRespostaId() {
        return mTextoRespostaId;
    }

    public void setTextoRespostaId(int textoRespostaId) {
        mTextoRespostaId = textoRespostaId;
    }

    public boolean isRespostaCorreta() {
        return mRespostaCorreta;
    }

    public void setRespostaCorreta(boolean respostaCorreta) {
        mRespostaCorreta = respostaCorreta;
    }
}
