package com.alphawallet.app.ui.widget.adapter;

import androidx.annotation.NonNull;

import com.alphawallet.app.entity.lifi.Connection;
import com.alphawallet.app.entity.lifi.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TokenFilter
{
    private final List<Token> tokens;

    public TokenFilter(List<Token> tokens)
    {
        this.tokens = tokens;
    }

    public List<Token> filterBy(String keyword)
    {
        String lowerCaseKeyword = lowerCase(keyword);

        List<Token> result = new ArrayList<>();
        // First filter: Add all entries that start with the keyword on top of the list.
        for (Token token : this.tokens)
        {
            String name = lowerCase(token.name);
            String symbol = lowerCase(token.symbol);

            if (name.startsWith(lowerCaseKeyword) || symbol.startsWith(lowerCaseKeyword))
            {
                result.add(token);
            }
        }

        // Second filter: Add the rest of the entries that contain the keyword on top of the list.
        for (Token token : this.tokens)
        {
            String name = lowerCase(token.name);
            String symbol = lowerCase(token.symbol);

            if (name.contains(lowerCaseKeyword) || symbol.contains(lowerCaseKeyword))
            {
                if (!result.contains(token))
                {
                    result.add(token);
                }
            }
        }
        return result;
    }

    @NonNull
    private String lowerCase(String name)
    {
        return name.toLowerCase(Locale.ENGLISH);
    }

}
