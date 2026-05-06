package com.example.security;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

    // 256-bit secret key
    private final String SECRET =
            "mysecuresecretkeymysecuresecretkey12345";

    private final Key key =
            Keys.hmacShaKeyFor(SECRET.getBytes());

    // GENERATE TOKEN

    public String generateToken(String email) {

        return Jwts.builder()

                .setSubject(email)

                .setIssuedAt(new Date())

                .setExpiration(
                        new Date(System.currentTimeMillis()
                                + 1000 * 60 * 60))

                .signWith(key, SignatureAlgorithm.HS256)

                .compact();
    }

    // EXTRACT USERNAME

    public String extractUsername(String token) {

        return extractClaims(token).getSubject();
    }

    // EXTRACT CLAIMS

    public Claims extractClaims(String token) {

        return Jwts.parserBuilder()

                .setSigningKey(key)

                .build()

                .parseClaimsJws(token)

                .getBody();
    }

    // VALIDATE TOKEN

    public boolean validateToken(
            String token,
            String email) {

        return extractUsername(token).equals(email);
    }
}