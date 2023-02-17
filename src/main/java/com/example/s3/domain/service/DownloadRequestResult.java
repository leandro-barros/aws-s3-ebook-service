package com.example.s3.domain.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DownloadRequestResult {

    private String downloadSignedUrl;

}